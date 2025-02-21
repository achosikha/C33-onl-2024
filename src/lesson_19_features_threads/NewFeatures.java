package lesson_19_features_threads;

import lesson_19_features_threads.annotationLombok.Person;
import lesson_19_features_threads.annotationLombok.User;

import java.io.*;

public class NewFeatures {
    public static void main(String[] args) {
        int number = 11;
        System.out.println("Please, tell me which day is number " + number + " in the week: " + getSwitchValue(number));
    }

    public static void switchWithYield(){
        int number = 1;

        String message = switch (number) {
            case 1 -> {
                yield "Got a 1";
            }
            case 2 -> {
                yield "Got a 2";
            }
            default -> {
                yield "More than 2";
            }
        };
    }

    public static void useInstanceOf(){
        // If you need to use InstanceOf it means you have bad inheritance system
        // Need to refactor the code
        // Проверяет является ли последующий класс дочерным определенному супер классу
        Person user = new User("Vasya", "Vladimirov", "30");

        // У нас нет size & typeof
        // Потому что для байт кода на всех машинах есть только один размер, переменная типа полное чилос
        // везде весит одно и тоже место, что обеспечивает переносимость

        // У нас нет определение типа, поскольку у нас строгая типизация и программа должна быть написана правильно
        // instanceof было все-таки добавлено, но если вы его используете, значит ваш код плохой!
        if (user instanceof User){
            System.out.println("This user object was created based on User class");
        }
    }

    public static String getSwitchValue(int dayNumber){
        return switch (dayNumber){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";

            // Can make an exception
            // Or just a regular statement
            default -> throw new IllegalStateException();
            // default -> "There is not such number in the week: " + dayNumber;
        };
    }

    public static void createVar(){
        // Динамический язык программирования
        // Джава статический, язык строгой типизации стандартно у нас тип переменой предопределяет в возможные данные
        // var - автоматическое определение типа переменной исходя из данных, которые будут в них храниться
        // Только на уровне метода
        var r = 10; // Компилятору значение переменной подсказывает тип
        var a = "A";
        var g = 18.5;
        var letter = 'A';
    }

    public static void tryWithResources(){
        // OLD STYLE, resource opens and I must close it myself
        try{
            BufferedReader b = new BufferedReader(new FileReader(new File("ask")));
            System.out.println("Welcome");
            // CODE
            // CODE
            b.close();
        } catch (FileNotFoundException e){
            System.out.println("Not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // OPEN RESOURCE b
        try(BufferedReader b = new BufferedReader(new FileReader(new File("ask")))){
            System.out.println("Welcome");
        } catch (FileNotFoundException e){
            System.out.println("Not found!");
        } catch (IOException e){
            System.out.println("I/O mistake!");
        }
    }
}
