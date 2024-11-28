package lesson_3_homework;

import java.util.Scanner;

public class OperatorsHomeWork {
    public static void main(String[] args) {
        // only value
        /*
        int sum = returnInt(); // method returnInt() -> sum int
        System.out.println(sum);
        System.out.println(returnInt());
        System.out.println(getFullName());
        System.out.println(scanString());
        System.out.println("You enter information is: " + scanStringAdvanced());

         */

        //
        //
        //
        //
        /*
        while(true){
            // WON, LOST, DRAW
            // method -> checkStatus()

            // IF WON -> show message
            // IF LOST -> show message
            // IF DRAW -> show message
            // method -> checkStatus() -> WON -> youWON()
            //                         -> LOST -> youLOST()
        }
         */
        System.out.println(getFullData());
    }

    // Task 1. Calculate max and min of two integer values
    public static void calculateMaxMin() {
        int maxValue = 100;
        int minValue = 90;

        // else-if structure
        if (maxValue > minValue) {
            System.out.println("maxValue > minValue");
        } else if (maxValue < minValue) {
            System.out.println("maxValue < minValue");
        } else {
            System.out.println("maxValue == minValue");
        }

/*
        if (maxValue > minValue)
            System.out.println("maxValue > minValue");
        if (maxValue < minValue)
            System.out.println("maxValue < minValue");
        if (maxValue == minValue)
            System.out.println("maxValue == minValue");
 */
    }

    // Task 2. Enter values via scanner and calculate sum
    public static void calculateSum() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter value number one: ");
        double valueOne = input.nextDouble();
        System.out.print("Please, enter value number two: ");
        double valueTwo = input.nextDouble();
        double sum = valueTwo + valueOne;
        System.out.println("Your value one is " + valueOne + " and your value two is: " + valueTwo +
                ". Sum equals to: " + sum);

        // close the resource
        input.close();
    }

    // Task 3. Receive a line and show it
    public static void getLine() {
        System.out.print("Please, enter a string value and then show it: ");
        // use anonymous class, has no name, meaning no repeatable use
        String line = new Scanner(System.in).nextLine();
        System.out.println("Your line is: " + line);
    }

    // Task 4. use all three keywords break, continue, return
    public static void useKeywords() {
        for (int letter = 65; letter < 91; letter++) {
            if ((char) letter == 'J') {
                break;
            }
            System.out.print((char) letter + "\t");
        }

        System.out.println("\n-------------------------------------------------------");
        for (int letter = 97; letter < 123; letter++) {
            if ((char) letter == 'e') {
                continue;
            }
            System.out.print((char) letter + "\t");
        }

        System.out.println("\n-----------------------------------------------------------");
        for (int letter = 97; letter < 123; letter++) {
            if ((char) letter == 'b') {
                return;
            }
            System.out.print((char) letter + "\t");
        }

        System.out.println("this is additional code...");
    }

    // Task 5. return in switch
    public static void useSwitchReturn() {
        String food = "mango";

        switch (food) {
            case "mango":
                System.out.println("This is a fruit...");
                return;
            case "apple":
                System.out.println("This is also a fruit...");
                break;
            case "cucumber":
                System.out.println("This is not a fruit...");
                break;
            default:
                System.out.println("Something else...");
                break;
        }

        System.out.println("This code is after switch...");
    }

    // Task 6. Lambda and switch
    public static void useLambdaSwitch() {
        // Lambda expressions not a golden classical Java
        String food = "mango";

        switch (food) {
            case "mango" -> System.out.println("This is a fruit...");
            case "apple" -> System.out.println("This is also a fruit...");
            case "cucumber" -> System.out.println("This is not a fruit...");

            // if (tomato && potato) -> System.out.println("This is not a fruit..."
            case "tomato", "potatoe" -> System.out.println("This is not a fruit...");
            default -> System.out.println("Something else...");
        }
    }

    // Task 7. for variations
    public static void useForVariations() {
        // for (initialize; logical condition; arithmetic)
        // for (int value = 10, valueOne = 19; value > 0 && value < 100; value--, valueOne++)
        for (int value = 10; value > 0; value--) {
            System.out.print(value + "\t");
        }
        System.out.println();

        int value = 10;
        for (; value > 0; value--) {
            System.out.print(value + "\t");
        }
        System.out.println();

        // without logical condition - eternal loop
        value = 10;
        for (; ; value--) {
            if (value == 5) {
                break;
            }
            System.out.print(value + "\t");
        }

        System.out.println();

        /*
        for (; ;){
            // loop without value, without condition (eternal), without arithmetic
        }
         */

        // game or something else
        // needs eternal loop that will be crushed by return or any other condition
        while (true) {
            System.out.println("Please, enter a message p or l, p for play, l for leave...");

            // One time use of scanner directly in the if body
            // not for чайников
            if ((new Scanner(System.in).nextLine()).equals("p")) {
                System.out.println("Welcome to eternal game...");
            } else {
                return;
            }
        }
    }

    // Task 8. return value method
    public static int returnInt() {
        // method can return value
        // Value 1
        // Value 2
        // Sum
        int valueOne = 100;
        int valueTwo = 200;
        int sum = valueTwo + valueOne;

        return sum;
    }

    // Task 9. Get name and surname
    public static String getFullName() {
        String name = "Archil";
        String surname = "Sikharulidze";
        String fullName = name + " " + surname;

        return fullName;
    }

    // Task 10. Use scanner to get line and return it
    public static String scanString() {
        System.out.print("Please, enter a string value:");
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        return line;
    }

    // Task 11. Use scanner improved
    public static String scanStringAdvanced() {
        System.out.print("Please, enter a string value:");

        return new Scanner(System.in).nextLine();
    }

    // Task 12. create permanent scanner
    // public static int getInput()
    public static String getInput() {
        Scanner input = new Scanner(System.in);

        // input.nextInt()
        return input.nextLine();
    }

    public static Scanner getScannerInput() {
        // for beginners: Scanner input = new Scanner(System.in);
        // return input;

        // for advanced
        return new Scanner(System.in);
    }

    public static String getFullData() {
        System.out.print("Please, enter your name: ");
        String name = getScannerInput().nextLine();
        System.out.print("Please, enter your age: ");
        int age = getScannerInput().nextInt();

        return  "Your name is: " + name + ". Your age is: " + age + ".";
    }
}
