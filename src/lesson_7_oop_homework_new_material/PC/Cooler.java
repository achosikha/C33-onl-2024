package lesson_7_oop_homework_new_material.PC;

public class Cooler {
    private String name;
    private String model;
    private String company;
    private int speed;

    public Cooler(String name, int speed, String company, String model){
        this.name = name;
        this.model = model;
        this.company = company;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "\t\tDetails: \n" +
                "\t\t\tName = " + this.name + '\n' +
                "\t\t\tModel = " + this.model + '\n' +
                "\t\t\tCompany = " + this.company + '\n' +
                "\t\t\tSpeed = " + this.speed + '\n';
    }
}
