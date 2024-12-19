package lesson_9_polymorphism_abstract.Animals;

public class Fish extends WaterAnimal{
    public Fish(String color, String size, double weight, String depth, boolean isBlind) {
        super(color, size, weight, depth, isBlind);
    }

    public void getFishMsg(){
        System.out.println("This message comes from a Fish Class.");
    }

    @Override
    public void getFinalStop() {
        System.out.println("The final stop is FISH!");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" +
                "\t\t\t\tThis is a FISH.";
    }
}