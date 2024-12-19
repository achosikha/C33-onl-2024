package lesson_9_polymorphism_abstract.Animals;

public class Animal {
    private final String color;
    private final String size;
    private final double weight;

    public Animal(String color, String size, double weight) {
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    public void getFinalStop(){}

    @Override
    public String toString() {
        return "Animal: \n" +
                "\tColor: " + this.color + '\n' +
                "\tSize: " + this.size + '\n' +
                "\tWeight: " + this. weight + "\n";
    }
}
