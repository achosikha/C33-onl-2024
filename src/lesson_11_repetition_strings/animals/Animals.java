package lesson_11_repetition_strings.animals;

public class Animals {
    private final String name;
    private final String color;
    private final int age;

    public Animals(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals: \n" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
