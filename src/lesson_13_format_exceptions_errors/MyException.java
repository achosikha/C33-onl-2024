package lesson_13_format_exceptions_errors;

import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        // Проверяем на ввод строчки с максимальной длиной в 20 символов, минимальной 2 символа и если пустота
        try{
            System.out.print("Please enter a string message that is maximum of 20 characters, " +
                    "minimum of two and is not empty: ");
            throwStringCheckException(new Scanner(System.in).nextLine());
        } catch (LengthException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    // 1. Create your class and if you need, usually you need, extend Exception
    // 1.1. You can use constructor or simply override methods()
    // 2. In main class you must create a method that THROWS your User Exception
    // 2.2. In this method you should have at least one THROW NEW ...
    // 3. In a try-catch block you must call the THROWS method to initialize it.
    public static void throwStringCheckException(String str) throws LengthException{
        // if (str == null | str.isEmpty()) -> exception, cannot invoke isEmpty because there is no str, no address
        if (str.isEmpty()){
            // ключевое слово throw используется лишь внутри кода, не на уровне метода
            throw new LengthException("Your string is simply empty...");
        } else if (str.length() > 20){
            throw new LengthException("Your string has achieved maximum size. You must fit 20 letters.");
        } else if (str.length() < 2){
            throw new LengthException("Your string is lesser then the minimum length required. " +
                    "You must have at least 2 letters.");
        }
    }
}
