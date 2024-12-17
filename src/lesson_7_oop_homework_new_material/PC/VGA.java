package lesson_7_oop_homework_new_material.PC;

public class VGA {
    private String name;
    private String model;
    private int memory;

    public VGA(String name, String model, int memory) {
        this.name = name;
        this.model = model;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "\t\tDetails: \n" +
                "\t\t\tName = " + this.name + '\n' +
                "\t\t\tModel = " + this.model + '\n' +
                "\t\t\tMemory = " + this.memory + '\n';
    }
}
