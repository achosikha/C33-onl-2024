package lesson_8_polymorphism.Animals;

public class Lion extends Animals{
    public Lion(String animal, String name, String color, int age) {
        super(animal, name, color, age);
    }

    @Override
    public void makesNoise() {
        System.out.println("I am a Lion and the Lion ROARS!");
    }
}
