package lesson_13_format_exceptions_errors;

public class MyBasicExceptions {
    public static void main(String[] args) {
        // Exceptions and Errors
        // Исключения и ошибки

        // try-catch block
        // try-catch block + finally
        // try-catch with resources
        // throw, throws
        // Перехват исключений и ошибок на уровне непосредственно метода или же внутреннего кода

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
}
