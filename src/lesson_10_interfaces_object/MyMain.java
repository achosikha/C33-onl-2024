package lesson_10_interfaces_object;

import lesson_10_interfaces_object.intertypes.InterfaceTypes;

// Interfaces to check - homework:
// 1. Cloneable
// 2. Comparator
// 3. Comparable
// 4. Serializable (just for an observation, how to do it)

public class MyMain {
    public static void main(String[] args){
        createObjects();
    }

    public static void createObjects(){
        // 1. Object we need to structure hierarchy, to inherit basic qualities and methods;
        // 2. Object we need when we are unsure what instance can appear
        // 3. We never intentionally create Object instances
        // 4. We even have Generics to avoid creating Objects
        Object integer = 100;
        Object doubleV = 19.555;
        Object string = "Archil Sikharulidze";
        Object letter = 'A';
        Object isAlive = true;
        Object interfaceClassInstance =
                new InterfaceTypes("T1", "Java", 1, 9);

        System.out.println(integer);
        System.out.println(doubleV);
        System.out.println(string);
        System.out.println(letter);
        System.out.println(isAlive);
        System.out.println(interfaceClassInstance);

        // By casting back you can get an access
        System.out.println(((InterfaceTypes) interfaceClassInstance).getBasicMessage());

        System.out.println("-----------------------------------------");
        Object[] diffentTypes =
                new Object[]{101, 'A', "Archil", true,
                        new InterfaceTypes("T5", "Java", 1, 0)};

        for (Object el : diffentTypes){
            System.out.println(el);
        }

        getAnyInstances(doubleV);
    }

    public static void getAnyInstances(Object o){
        if (o instanceof Integer){
            System.out.println("It is an integer...");
            // o is Object (super class)
            // Мы не можем объектами легко манипулировать
            // поэтому нам надо довести до базового класса
            // Нужно провести приведение типов
            // Если у меня Объект это целое число, то я могу его привести к целому числу
            int x = (Integer) o;
        } else if (o instanceof Double){
            System.out.println("It is a double...");
        }
    }

    public static void getHashCode(){
        InterfaceTypes t1 =
                new InterfaceTypes("T1", "Java", 1, 0.1F);

        InterfaceTypes t2 =
                new InterfaceTypes("T1", "Java", 1, 0.1F);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println("t1 & t2 hash codes: " + (t1.hashCode() == t2.hashCode()));
    }

    public static void makeObject(){
        // Instead of typeof in Java we have instanceof - never use, READ!
        // sizeof -> in Java all variables are of the same size despite the PC
        int intValue = 100;
        boolean isAlive = true;
        char letter = 'A';
        long longValue = 192020L;
        float floatValue = 128.3F;
        double doubleValue = 1910.101;

        // Beneath Object
        // Классовое представление примитивных типов
        // На языке программирования, объертка для типа int
        // Классовая объертка для типа int - Integer
        // char - Character
        // float - Float
        // double - Double
        // boolean - Boolean
        // long - Long
        // Integer, Float, Double, Long -> Number (super class)
        Integer integer = 101;
        // Integer integer2 = new Integer(101); -> before Java 9, Java 8 it will be working, but it is deprecated
        // Deprecated means that it is not supported by the official developers anymore, do not use
        Double doubleV = 19.202;
        Float floatV = 29.1F;
        Long longV = 19101010190L;
        Boolean isWorking = false;
        Character letterC = 'L';
        // Character letterU = new Character('J'); -> not working after version 9
        Number myNumber = 19944L;
        Number myDoubleNumber = 199.202;
    }

    public static void copyConstructor(){
        InterfaceTypes t1 =
                new InterfaceTypes("T1", "Java", 1, 0.9F);

        // Create t2 based on t1 during constructor call
        InterfaceTypes t2 = new InterfaceTypes(t1);
        t1.getGeneralMsg();
        System.out.println("-----------------------------");
        t2.getGeneralMsg();
        t2.setBasicMessage("Independent...");
        System.out.println("***");
        t2.getGeneralMsg();
        System.out.println("***");
        t1.getGeneralMsg();
    }

    public static void makeDeepCopy(){
        // Если мы хотим сделать клон нашего объекта, можно использовать Cloneable и через него переопределить
        // метод close()
        // Можно в супер классе Object использоват тоже метод глобальный clone()
        // Или же можно, создать свой собственный метод в интерфейсе и задать собственные элементы копирования
        InterfaceTypes t1 =
                new InterfaceTypes("T1", "Java", 1, 9.1F);
        InterfaceTypes t2 =
                new InterfaceTypes("T2", "Kotlin", 9, -1);

        t1.getGeneralMsg();
        System.out.println("-----------------------------");
        t2.getGeneralMsg();
        t1.makeClone(t2);
        System.out.println("---------------------AFTER MANUALLY CREATED CLONE METHOD-------------------------");
        t1.setBasicMessage("Independent value....");
        t1.getGeneralMsg();
        System.out.println("****************************************");
        t2.getGeneralMsg();
    }

    public static void makeShallowCopy(){
        // If you compare two objects via == (object1 == object2) it is called SHALLOW COMPARISON
        // Потому что, вы сравниваете не внутренности, а адреса;
        // If you apply one object to another (object1 = object2), it is also called SHALLOW COPY
        // Потому что, он не перенесет все данные правильно, особенно если у вас там внутри другие объекты

        int[] myIntegers = new int[]{1, -1, 9, 1};
        int[] myIntegersTwo = new int[]{8, 1, 19, 0};
        // SHALLOW COPY
        // Changed address nothing else
        myIntegers = myIntegersTwo;

        System.out.println(myIntegers[0]);

        // Create two objects
        InterfaceTypes t1 =
                new InterfaceTypes("T1", "Java", 1, 0.0F);
        InterfaceTypes t2 =
                new InterfaceTypes("T2", "Kotlin", 0, 1.9F);
        InterfaceTypes t3 =
                new InterfaceTypes("T2", "Kotlin", 0, 1.9F);

        System.out.println("Address of t1: " + t1);
        System.out.println("t1 get basic message: " + t1.getBasicMessage());
        System.out.println("Address of t2: " + t2);
        System.out.println("t2 get basic message: " + t2.getBasicMessage());
        System.out.println("Address of t3: " + t3);
        System.out.println("t3 get basic message: " + t3.getBasicMessage());
        System.out.println("If I compare t1 and t2 via == " + (t1 == t2));
        System.out.println("If I compare t2 and t3 via == " + (t2 == t3)); // we compare addresses

        // Shallow Copy
        t1 = t2;
        System.out.println(t1.getBasicMessage());
        System.out.println(t2.getBasicMessage());
        System.out.println("If I compare t1 & t2 via == : " + (t1 == t2));
    }

    public static void compareTwoObjects(){
        InterfaceTypes interfaceTypesOne =
                new InterfaceTypes("Interface", "Java", 1, 9.0);
        InterfaceTypes interfaceTypesTwo =
                new InterfaceTypes("Interface", "Kotlin", 1, 9.0);

        System.out.println(interfaceTypesOne);
        System.out.println(interfaceTypesTwo);
        System.out.println("If you compare two objects via == you always compare too addresses and if you use" +
                " keyword new you always allocate new memory new address: " + (interfaceTypesOne == interfaceTypesTwo));

        System.out.println(interfaceTypesOne.compareOnlyThis(interfaceTypesTwo));
    }

    public static void callBasicTypeInterface(){
        InterfaceTypes interfaceTypes = new InterfaceTypes("Welcome to Interface",
                                                        "Java Interface",
                                                            191,
                                                            18.1);

        interfaceTypes.showText("Welcome to basic interface type where you can simply pass some messages...");
        interfaceTypes.compareText("Kotlin is better then Java...");
        interfaceTypes.showDigits(190, 17.9);
    }
}
