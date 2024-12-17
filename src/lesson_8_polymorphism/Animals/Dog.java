package lesson_8_polymorphism.Animals;

public class Dog extends Animals{
    public Dog(String animal, String name, String color, int age) {
        super(animal, name, color, age);
    }

    @Override
    public void makesNoise() {
        System.out.println("I am a Dog and the Dog BARKS!");
    }
}
