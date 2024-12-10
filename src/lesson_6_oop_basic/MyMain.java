package lesson_6_oop_basic;

// Two classes not integrated to each other (inserted classes) are BAD approach!
public class MyMain {
    public static void main(String[] args){
        // Entry-point
        Car defaultValues = new Car();
        defaultValues.getGeneralInformation();

        System.out.println("-------------------------------------");
        // Create instance of Car with parameters
        Car mercedes = new Car("Mercedes", "GLK 320", "White", "R5S",
                2022, 320, 20, true);
        mercedes.getGeneralInformation();

        System.out.println("----------------------------------------");
        Car opel = new Car("Opel", "Astra", "Grey", "JK-1");
        opel.getGeneralInformation();

        System.out.println("-------------------------------------------");
        Car jeep = new Car("Jeep", "Land", "Blue", "Jeep J-K-2", 2019);

        // new -> 0xRT11R
        // this = 0xRT11R;
        // this. -> 0xRT11R. -> variables, methods...
        jeep.getGeneralInformation();
    }

    public static void getCarGeneral(){
        // In Java all instances of classes are stored in Heap and you need to allocate a memory via NEW
        // HEAP
        CarGeneral opel = new CarGeneral();
        opel.getGeneralInformation();

        CarGeneral bmw = new CarGeneral();
        bmw.company = "BMW";
        bmw.speed = 320;
        bmw.color = "BLACK";
        bmw.weight = 1000;
        bmw.milesDriven = 19300L;
        bmw.category = 'B';
        bmw.isWorking = true;
        bmw.additionalInformation = "LIKE NEW";
        bmw.spareParts[0] = "BMW Spare Part I";
        bmw.spareParts[1] = "BMW Spare Part II";
        bmw.spareParts[2] = "BMW Spare Part III";
        bmw.spareParts[3] = "BMW Spare Part IV";

        System.out.println("---------------------------------------------------");
        bmw.getGeneralInformation();
        System.out.println("---------------------------------------------------");

        System.out.println("BMW speed equals:" + bmw.speed);
        System.out.println("BMW speed method getSpeed(): " + bmw.getSpeed(bmw.speed, "Just a trash..."));
    }
}

// Blueprint Object
class CarGeneral{
    // Свойства объекта, данные об объекте уровня класс
    // Свойства объекта максимальный уровень "видимости"
    // На уровне класса объявленные примитивные переменные компилятором
    // автоматически получает дефолтное значение
    String company; // default value
    int speed;
    long milesDriven; // declared class level variable = default value

    // Non-zero value -> " " <=, zero-value == "", null -> no address in the heap, no memory
    String color; // null means there is no address in the heap, waiting for the address
    double weight;
    char category;
    boolean isWorking;
    String additionalInformation = "Unknown";
    String[] spareParts = new String[]{
            "Wheel", "Window", "Bumper", "Chair"
    };

    // Only static can work with static
    public String getSpeed(int max, String additional){
        return "This is a getSpeed() method called directly via BMW class instance.\n" +
                "Your max speed is: " + max + ". Your additional information passed is: " + additional;
    }

    public void getGeneralInformation(){
        // Если слово светится фиолетовым, то это свойство уровня класс
        System.out.println("String company default value: " + company);
        System.out.println("int speed default value: " + speed); // applied class level variable, no mistake
        System.out.println("double weight default value: " + weight);
        System.out.println("long milesDriven default value: " + milesDriven);
        System.out.println("char category default value: " + category);
        System.out.println("boolean isWorking default value: " + isWorking);
        System.out.println("String additional information set default value: " + additionalInformation);
        showSpareParts();

        /* no default values by the compiler for non-class variables
        int speedMax; // declared method-level variable
        System.out.println(speedMax); // mistake
         */
    }

    public void showSpareParts(){
        for (int index = 0; index < spareParts.length; index++){
            System.out.println("Spare part " + (index + 1) + ": " + spareParts[index]);
        }
    }
}