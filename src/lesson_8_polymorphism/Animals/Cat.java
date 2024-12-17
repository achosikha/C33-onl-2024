package lesson_8_polymorphism.Animals;

public class Cat extends Animals{
    public Cat(String animal, String name, String color, int age) {
        super(animal, name, color, age);
    }

    @Override
    public void makesNoise() {
        System.out.println("I am a Cat and the Cat MEWS!");
    }
}
