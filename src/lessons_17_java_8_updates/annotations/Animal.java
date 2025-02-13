package lessons_17_java_8_updates.annotations;

public class Animal implements Action{
    private final String animalType;
    private final int age;

    public Animal(String animalType, int age) {
        this.animalType = animalType;
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getAge() {
        return age;
    }

    // Please, check whether public String toString() is a method of a superior class
    // In our case it is super class Object
    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String sound(String message) {
        return message;
    }
}
