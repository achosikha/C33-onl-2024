package lesson_7_oop_homework_new_material.PC;

public class Processor {
    private String name;
    private String model;
    private double sequence;

    public Processor(String name, String model, double sequence) {
        this.name = name;
        this.model = model;
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "\t\tDetails: \n" +
                "\t\t\tName = " + this.name + '\n' +
                "\t\t\tModel = " + this.model + '\n' +
                "\t\t\tSequence = " + this.sequence + '\n';
    }
}
