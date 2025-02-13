package lessons_17_java_8_updates.annotations;

import java.util.Comparator;
import java.util.Scanner;

public class MyFunctionalAnnotation {
    public static void main(String[] args) {
        callLambdaNew();
    }

    public static void callLambdaNew(){
        // Before lambda expression used to get value from anonymous call of the CalculateValue interface
        // creates method body

        CalculateValue calculateValue;

        // (parameters, parameters) -> (стрелка значит выполни) и тело метода
        // Если у вас тело метода больше одной строки, надо обязательно вставить в {}
        calculateValue = (w, y) -> w * y;
        double sum = calculateValue.calculate(18, 19.5); // calls method

        System.out.println(sum);

        String msg =
                ((GetStringMessage) msg1 -> msg1).getMessage("Welcome to anonymous interface realization in an old way");

        System.out.println(msg);
    }

    public static void compareString(){
        boolean isStringTheSame = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        }.equals(new Object());
    }

    public static void callLambdaOld(){
        // Before lambda expression used to get value from anonymous call of the CalculateValue interface
        double sum = new CalculateValue() {
            @Override
            public double calculate(double w, double x) { // creates method body
                return w * x;
            }
        }.calculate(109, 100); // calls method

        System.out.println(sum);

        String msg = new GetStringMessage(){
            @Override
            public String getMessage(String msg){
                return msg;
            }
        }.getMessage("Welcome to anonymous interface realization in an old way");

        System.out.println(msg);
    }

    public static void getAnonymousValues(){
        System.out.println("Enter values");

        // Анонимный вызов класса
        // Анонимный вызов интерфейса
        // Анонимный класс, анонимный интерфей - когда был создан класс или интерфейс,
        // без его сохранения в постоянной памяти
        new Scanner(System.in).nextLine();

        String animalType = new Animal("Cat", 25).getAnimalType();
        int animalAge = new Animal("Monkey", 15).getAge();
        String message = new Animal("Lion", 36).sound("Lion ROARS...");

        System.out.println(animalType);
        System.out.println(animalAge);
        System.out.println(message);
    }
}
