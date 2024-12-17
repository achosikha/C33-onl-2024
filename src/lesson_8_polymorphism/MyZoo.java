package lesson_8_polymorphism;

import lesson_8_polymorphism.Animals.*;
import lesson_8_polymorphism.ConstructorDelegate.*;

/*
    final - переменная уровня класс: его значение должно быть задано не позднее конструктора и оно не может быть изменено
    final - с названием класса: public final class Car от него никто не может наследоваться
    final - в названии метода: public final void getMsg() - его нельзя переопределить
 */

public class MyZoo {
    public static void main(String[] args) {
        createConstructorDelegates();
    }

    public void getMsg(){
        // static has two rules:
        // 1. You cannot make a call of non-static things from static methods
        // 2. But you can call static staff from non-static methods
    }

    public static void createConstructorDelegates(){
        Car bmw = new Car("BMW");
        Car mercedes = new Car("Mercedes", "Mercedes-Benz");
        Car opel = new Car("Opel", "Opel Astra", "Black");
        Car opelOne = new Car("Opel", "Opel Astra", "Black");
        Car mercedesOne = new Car("Mercedes", "Mercedes-Benz");
        Car mercedesTwo = new Car("Mercedes", "Mercedes-Benz");
        Car bmwOne = new Car("BMW");
        Car bmwTwo = new Car("BMW");
        Car bmwThree = new Car("BMW");

        System.out.println(bmw);
        System.out.println(mercedes);
        System.out.println(opel);

        System.out.println("-------------------------COUNTER----------------------------");
        System.out.println(bmw.getNonStaticCounter());
        System.out.println(mercedes.getNonStaticCounter());
        System.out.println(mercedesTwo.getNonStaticCounter());
        System.out.println(opel.getNonStaticCounter());
        System.out.println(opelOne.getNonStaticCounter());

        System.out.println("-----------------------------STATIC COUNTER---------------------");
        // Чтобы обратиться к статическим данным, надо это сделать непосредственно через класс, а не его
        // экземпляр
        System.out.println(Car.getCarCounter());
    }

    public static void useOverridenMethods(){
        getSum();
        getSum(124);
        getSum(-1, 9);
        getSum(6, 1.4);
        getSum(13.4, -9.1);
    }

    public static void createAnimals(){
        Animals animalLion = new Animals("Lion", "Johnny", "Yellow", 4);

        System.out.println(animalLion);

        Animals[] animals = new Animals[] {
                new Lion("Lion", "Jenny", "Yellow", 10),
                new Lion("Lion", "Kep", "Dark Yellow", 2),
                new Cat ("Cat", "Pitt", "White", 1),
                new Dog ("Dog", "Vasya", "Black with White Dots", 4)
        };

        for (Animals animal : animals){
            System.out.println(animal);
            animal.makesNoise();
        }
    }

    public static void getSum(){
        System.out.println("Method override with no parameters...");
    }

    public static void getSum(int value){
        System.out.println("Method override with one int parameters...");
    }

    public static void getSum(int value, double valueDouble){
        System.out.println("Method override with two parameters int & double...");
    }

    public static void getSum(int valueInt, int valueIntTwo){
        System.out.println("Method override with two parameters int & int...");
    }

    public static void getSum(double doubleValue, double doubleValueTwo){
        System.out.println("Method override with two parameters double & double...");
    }
}