package lesson_13_format_exceptions_errors;

import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyBasicExceptions {
    public static void main(String[] args) throws IOException{
        // Exceptions and Errors
        // Исключения и ошибки

        // try-catch block
        // try-catch block + finally
        // try-catch with resources
        // throw, throws
        // Перехват исключений и ошибок на уровне непосредственно метода или же внутреннего кода

        // Не всегда нужно обеспечивать через исключения продолжение работы вашей аппликации
        // Однако, важно обеспечить нерушимость процесса, чтобы программа правильно выдавала ошибки
        // Указывала на их суть и в случае надобности, сохраняла дневник ошибок в документе

        // Надо быть осторожными с бесконечными циклами, поскольку для компилятора это не ошибка
        // память у вас все равно рухнет.
        throwsExceptionMethod();
    }

    public static void basicExceptions(){
        // Division by Zero
        int number1 = 18;
        int number2 = 0;

        if (number1 != 0 && number2 !=0){
            System.out.println(18/0); // Not allowed ERROR DIVISION BY ZERO
        } else {
            // Make a bold statement about MISTAKE
            System.err.println("You have tried to divide by ZERO. It is an exception!");
        }

        System.out.println(0/18); // Allowed 0
        System.out.printf("%d %c %f %s", 123, 'a', 45.4);
    }

    public static void checkedExceptions(){
        // When you have obligation to catch exceptions - it is called CHECKED
        // Исключения и ошибки, которые интегрированный компилятор заставляет нас проверить
        // Не проведет компиляцию до учета требования
        // Зачастую, это работа с внешними ресурсами или попытка подключить внешний ресурс, открыть файл,
        // подключиться к базе данных, найти класс... Выделяются зеленым цветом
        try {
            int value = System.in.read();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void uncheckedExceptions(){
        System.out.println(0/18);

        try{
            System.out.println(18/0);
        } catch (ArithmeticException e){
            System.out.println("You got an exception: " + e.getMessage());
        }

        System.out.println("This message comes after the DIVISION BY ZERO EXCEPTION!");
    }

    public static void getScannerData(){
        // if (I_do_something){
        // body of my code
        // }
        // and there is a mistake
        // catch(){}
        // catch(){}

        try {
            System.out.print("Please, enter integer value: ");
            int value = new Scanner(System.in).nextInt();
            System.out.print("Please, enter integer value: ");
            int valueTwo = new Scanner(System.in).nextInt();

            int sum = value / valueTwo;
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("InputMismatchException: " + e.getMessage());
        } catch (NoSuchElementException e){
            System.out.println("NoSuchElementException: " + e.getMessage());
        } catch (IllegalStateException e){
            System.out.println("IllegalStateException: " + e.getMessage());
        }

        System.out.println("ALL EXCEPTIONS HAVE BEEN CAUGHT!");
        System.out.println("Would you like to send these messages to a log?!");
    }

    // Unchecked exceptions
    public static void readMyArray(){
        char[] letters = new char[]{'K', 'h', 'W', '-'};

        // index 0 до letters.length
        // <= index 0 по letters.lengths
        try{
            for (int index = 0; index < letters.length; index++){
                System.out.println("You array is letters[" + index + "]: " + letters[index]);
            }

            String str = "Welcome to Java!";

            for (int index = 0; index <= str.length(); index++){
                System.out.print(str.charAt(index) + "  ");
            } // && || - & |
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            System.out.println("\nYou either have ArrayIndexOutOfBoundsException or StringIndexOutOfBoundsException: "
                    + e.getMessage());
        }
        System.out.println("After ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException exceptions mistake...");
    }

    // try-catch, try-catch-finally
    public static void getFile(){
        try{
            File file = new File
                            ("/home/achosikha/Desktop/C33-onl-2024/src/lesson_13_format_exceptions_errors/text.txt");

            FileInputStream inputStream = null;

            try{
                inputStream = new FileInputStream(file);

                int letter;
                while ((letter = inputStream.read()) != -1){
                    System.out.print((char) letter);
                }
            } catch (FileNotFoundException e){
                System.out.println("File was not found: " + e.getMessage());
            } catch (SecurityException e){
                System.out.println("You have some issues with security: " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                // Если у вас есть данные внутри самого catch, то он не будет виден в блоке finally
                // inputStream not known
                // Следует добавлять те вещи, которые вы считаете нужным в обязательном порядке сделать перед окончанием
                // try-catch блока
                inputStream.close();
            }
        } catch (NullPointerException | IOException e){
            System.out.println("File name has not been found: " + e.getMessage());
        }
    }

    // try-with-resources
    public static void tryWithResources(){
        File file;

        try{
            file = new File("src/lesson_13_format_exceptions_errors/text.txt");

            // try-wht-resources для того, чтобы автоматически закрывать ресурсы
            // no need for FINALLY and other CLOSE() operations
            // If it can it opens the document
            // If it opens the document it will by default close it
            try(FileReader fileReader = new FileReader(file)){
                int value;
                while ((value = fileReader.read()) != -1) {
                    System.out.print((char) value);
                }
            } catch (FileNotFoundException e){
                System.out.println("Your file was not found: " + e.getMessage());
            } catch (IOException e){
                System.out.println("There was a wider exception: " + e.getMessage());
            }
        } catch (NullPointerException e){
            System.out.println("File was not properly initialized: " + e.getMessage());
        }
    }

    // Exceptions hierarchy
    public static void checkExceptionsHierarchy() {
        // Exception (super catch)
        // RuntimeException
        // IOException каждое исключение отвечает за свою группу, если вы вставите исключение, где нет такой надобность
        // он подскажет вам
        // InterruptedException...
        try {
            int[] numbers = new int[]{19, 5, 6};

            for (int index = 0; index < numbers.length; index++) {
                System.out.println(numbers[index]);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter a value: " + scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException: " + e.getMessage());
        } catch (Exception e) {
            // Пробрасываем лишь в тех случаях, когда нет возможности поймать специфические исключения
            System.out.println();
        }
    }

    // To throw exception on method() level
    public static void throwsExceptionMethod() throws IOException{
        System.out.print("Please, enter one value: ");
        int value = System.in.read();

        // Keyword throws не путать с keyword throw
        // throws работает только на уровне метода и указывается после ее сигнатуры с указанием исключения
        // Однако, если метод пробрасывает исключение, то его должен поймать и также пробросить вызывающий метод
        // Или же в вызывающем метода все равно использовать блок try-catch
    }
}