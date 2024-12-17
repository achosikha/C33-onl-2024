package lesson_7_oop_homework_new_material.PC;

public class RAM {
    private String name;
    private String model;
    private int size;

    public RAM(String name, String model, int size) {
        this.name = name;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "\t\tDetails: \n" +
                "\t\t\tName = " + this.name + '\n' +
                "\t\t\tModel = " + this.model + '\n' +
                "\t\t\tCompany = " + this.size + '\n';
    }
}
