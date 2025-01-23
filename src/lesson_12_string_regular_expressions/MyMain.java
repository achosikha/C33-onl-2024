package lesson_12_string_regular_expressions;

public class MyMain {
    public static void main(String[] args) {
        intComparison();
    }

    public static void getBasicString(){
        String str = "STR Value"; // new, still object is created in Heap, JVM

        // JVM will create a String Pool in the heap and allocate and optimize everything
        // OBJECTS ARE NEVER STORED IN STACK IN JAVA, only references are stored in the stack
        // and they point to a String Pool in the heap

        BasicClass bsInfo = new BasicClass();
        bsInfo.getMyGeneralInfo();

        String concat = 25 + 25 + ""; // 25 + 25 + "Archil" + 25 + "1"
        String nullValue = null; // C++ nullpointer, there is some memory but no address
        String nonInitialized; // declared nothing cannot be used, no memory at all

        // String is a CONST value, instead of CONST is used FINAL
        // CONST VALUE cannot be changed
        int number = 10; // by default, non-const/final
        final int numberFinal = 11; // to make it const/final add keyword final

        // letters -> const address to the first element
        // letters == letters[0]
        // const letter[] = {1, 2, 3};
        // const letter -> letter[0]
        char[] letters = new char[]{'R', 'c', 'O'}; //

        System.out.println(str);

        // -> old value + 1 !!! no!!!
        str = "STR Value 1"; // The old address as well as the value is destroyed
        // The new address and the new value is created

        System.out.println("*******************************************");

        loopString();

        System.out.println("\n*****************************************");
        getRegister("WELCOME to JAVA development...");
    }

    public static void loopString(){
        for (char el : "Archil Sikharulidze".toCharArray()){
            System.out.print(el + "\t");
        }

        // Turon String to array
        char[] value = "Archil Sikharulidze".toCharArray();

        System.out.println();
        // String length and size
        // length -> все видные элементы строки
        // size -> все видные и не видные элементы строки + '\0'
        String str = "Archil Sikharulidze";

        // charAt takes every single element from the String
        for (int index = 0; index < str.length(); index++){
            System.out.print(str.charAt(index) + "\t");
            // Elements of the String cannot be changed in the original variable
        }
    }

    public static void getRegister(String message){
        System.out.println("Your original message is: " + message);
        System.out.println("Your changed message is: " + message.toLowerCase()); // method with return value or echo
        System.out.println("Your original message is: " + message);

        String lowerRegister = message.toLowerCase();
        System.out.println("Echo result: " + lowerRegister);
    }

    public static void enterValueString(String msg){
        // y or n, YES / NO
        if (msg.length() <= 3){
            System.out.println("Your message is of respective length!");
        } else if (msg.isEmpty()) {
            System.out.println("Is EMPTY");
        } else {
            System.out.println("Your message is too big!");
        }

        // 12.3 -> String -> Double (if) = ERROR
    }

    public static void calculator(){
        String expression = "12+5/10"; // ?
        String regex = "[+, /]";

        // "5*10+14 + 9" -> DO IT AT HOME!
        String[] splittedOld = expression.split("/");
        String[] splittedRegex = expression.split(regex);

        for (String el: splittedOld){
            System.out.println(el);
        }

        System.out.println();

        for (String el : splittedRegex){
            System.out.println(el);
        }
    }

    public static void intComparison(){
        String valueOne = "Archil";
        String valueTwo = "Archil";
        String valueThree = "Borya";
        String valueFour = "Chris";

        // comparison by INTEGER
        // 0 == equals (lv && rv are equal)
        //  -1 0 1
        System.out.println((valueOne.compareTo(valueTwo)));
        System.out.println((valueOne.compareTo(valueThree)));
        System.out.println((valueThree.compareTo(valueFour)));
        System.out.println((valueFour.compareTo(valueThree)));

        // Archil.equals(arChil) -> wrong
        // Archil.equalsIgnoreCase(arCHiL) -> true

        // indexOf only the first occurrence
        System.out.println(("ArchilA".indexOf('c')));

        // archil.sikharulidze@gmail.com
        // Archil.Sikharulidze@GMAIL.COM
        // equalsIgnoreCase()
        // toLowerCase()
    }
}