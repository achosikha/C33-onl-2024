package lesson_9_polymorphism_abstract.Animals;

public class WaterAnimal extends Animal{
    private final String depth;
    private final boolean isBlind;

    public WaterAnimal(String color, String size, double weight, String depth, boolean isBlind) {
        super(color, size, weight);
        this.depth = depth;
        this.isBlind = isBlind;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\t\tWater Animal: \n" +
                "\t\t\tDepth: " + this.depth + '\n' +
                "\t\t\tIs blind: " + this.isBlind;
    }
}
