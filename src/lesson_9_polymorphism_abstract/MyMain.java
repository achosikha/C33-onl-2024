package lesson_9_polymorphism_abstract;

import lesson_9_polymorphism_abstract.Animals.Animal;
import lesson_9_polymorphism_abstract.Animals.Fish;

public class MyMain {
    public static void main(String[] args) {
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