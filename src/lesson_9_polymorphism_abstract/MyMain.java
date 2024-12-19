package lesson_9_polymorphism_abstract;

import lesson_9_polymorphism_abstract.Animals.*;
import lesson_9_polymorphism_abstract.Car.*;
import lesson_9_polymorphism_abstract.interfacepanel.Panel;
import lesson_9_polymorphism_abstract.interfacepanel.PanelComputer;

public class MyMain {
    public static void main(String[] args) {
        createPanelComputer();
    }

    public static void createPanelComputer(){
        Panel panel = new PanelComputer("Computer");
        panel.turnOn();
        System.out.println(panel.getName());
        panel.getMethodWithDefaultBody();
    }

    public static void createCarCar(){
        // What if I create Car based on Car?
        // Empty useless instance, no precise data
        // Why do I need it?
        // I don't need it usually

        /*
        Car car = new Car("Car", "Unknown", 0, 0, 0);
        System.out.println(car);
         */
        // Animal animal = new Animal() -> Mammal

        Car regularCCar = new RegularCategoryC(
                "Jeep", "Black", 2022, 320, 40);
        Car truckCategoryA = new TruckCategoryA(
                "Land", "Yellow", 2019, 340, 20);
        Car truckCategoryB = new TruckCategoryB(
                "Opel", "Grey", 2018, 340, 20);
    }

    public static void callCreateAnimalFish(){
        createAnimal();

        System.out.println("--------------------------------------------");

        createFish();
    }

    public static void createAnimal(){
        Animal fish = new Fish("Red", "100x194", 34.6, "900 Meters", true);

        System.out.println(fish);
        fish.getFinalStop();
    }

    public static void createFish(){
        Fish goodFish = new Fish("White", "90x100", 45.5, "100 Metres", false);

        System.out.println(goodFish);
        goodFish.getFishMsg();
    }
}