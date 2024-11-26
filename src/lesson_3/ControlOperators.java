package lesson_3;

import java.io.IOException;
import java.util.Scanner;

public class ControlOperators {
    public static void main(String[] args) throws IOException {
        // This is a document about operators
        useBreakContinueReturn();
    }

    public static void useBreakContinueReturn(){
        // break -> breaks any system
        for (int value = 1; value < 11; value++){
            if (value == 5)
                break;
            System.out.println(value);
        }

        System.out.println("-----------------");

        // continue only in the loop
        for (int value = 1; value < 11; value++){
            if (value == 5)
                continue;
            System.out.println(value);
        }

        System.out.println("-----------------");

        // return
        for (int value = 1; value < 11; value++){
            if (value == 5)
                return; // end the whole method
            System.out.println(value);
        }

        System.out.println("The code after return...");
        System.out.println("Broken method...");
    }

    public static void useLoops(){
        // for
        // while
        // do while

        // 1 - variable, 2 - logical condition, 3 - changing value
        // eternal loop is a circle that never ends because it cannot achieve logical condition
        for (int value = 1; value < 11; value++){
            System.out.print(value + " - ");
        }

        System.out.println();

        // while
        int value = 1;

        // while пока проверяет логическое условие, а потом уже работает
        while(value < 11){
            System.out.print(value + " - ");
            value++;
        }

        // do while
        System.out.println();
        value = 1;

        // когда вам нужно, чтобы тело цикла хотя бы раз выполнилось
        do{
            System.out.print(value + " - ");
            value++;
        } while (value < 11);
    }

    public static void useSwitchMultiChoice(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter number of the month: ");
        int month = input.nextInt();

        // && - и
        // || - или, т.е. месяц равен 1 или 3
        /*
        if (month == 1 && month == 2 && month == 3){
            System.out.println("January - February - March");
        } else if (month == 4 && month == 5 && month == 6){
            System.out.println("April - May - June");
        } else {
            System.out.println("All other cases...");
        }
         */

        switch (month){
            case 1: // if (month == 1)
            case 2:
            case 3:
                System.out.println("January, February, March.");
                break;
            case 4: // if (month == 1)
            case 5:
            case 6:
                System.out.println("April - May - June.");
                break;
            default:
                System.out.println("This is a default value for unrecognized values...");
                break;
        }
    }

    public static void useSwitch(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter number of the month: ");
        int month = input.nextInt();

        switch (month){
            case 1: // if (month == 1)
                System.out.println("January.");
                break;
            case 2:
                System.out.println("February.");
                break;
            case 3:
                System.out.println("March.");
                break;
            default:
                System.out.println("This is a default value for unrecognized values...");
                break;
        }
    }

    public static void useElseIf(){
        // else if
        int valueMAX = 10;
        int valueMIN = 8;

        if (valueMAX > valueMIN){
            System.out.println("valueMAX > valueMIN");
        } else if (valueMAX < valueMIN){
            System.out.println("valueMAX < valueMIN");
        } else if (valueMAX == valueMIN){
            System.out.println("valueMAX == valueMIN");
        } else {
            System.out.println("Something went really wrong");
        }
    }

    public static void getLogicalOperators(){
        // if
        // else if
        // switch

        int valueMAX = 10;
        int valueMIN = 8;

        // >, <, >=, <=, !=, ==
        if (valueMAX < valueMIN){
            System.out.println("valueMAX > valueMIN");
            System.out.println("This is also true...");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter -y if you are married and -n if your are not: ");
        String answer = input.nextLine();
        boolean isMarried = false;

        if (answer.equals("y")){
            isMarried = true;
        }

        if (answer.equals("n")){
            isMarried = false;
        }

        // if (by_default is true)
        // if (isMarried == true)
        if (isMarried){
            System.out.println("You are married!");
        }

        // if (by_default is true)
        // if (isMarried == true) replace by if (isMarried)
        // ! - not
        // if (isMarried == false)
        if (!isMarried){ // не истина
            System.out.println("You are not married!");
        }
    }

    public static void getScanner(){
        // Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = input.nextLine();
        System.out.print("Please enter your surname: ");
        String surname = input.nextLine();
        System.out.print("Please, enter your age: ");
        int age = input.nextInt();
        System.out.print("Please, enter your weight: ");
        double weight = input.nextDouble();

        System.out.println("You have entered the following data:");
        System.out.println("\tYour name is: " + name); // Escape sequence \t - tabulation
        System.out.println("\tYour surname is: " + surname);
        System.out.println("\tYour age is: " + age);
        System.out.println("\tYour weight is: " + weight);
    }

    public static void enterCharacter() throws IOException {
        System.out.print("Please, enter one character: ");
        int value = System.in.read(); // reads only one value from the keyboard

        System.out.println("Your value is: " + (char) value);
    }
}