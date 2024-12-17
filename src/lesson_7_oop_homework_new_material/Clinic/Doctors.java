package lesson_7_oop_homework_new_material.Clinic;

import java.util.Arrays;

public class Doctors {
    private String name;
    private String surname;
    private String position;
    private String[] tasks;

    public Doctors(String name, String surname, String position, String[] tasks) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.tasks = tasks;
    }

    public void treatment(){
        System.out.println("General treatment method...");
    }

    @Override
    public String toString() {
        return "Doctors: \n" +
                "Name: " + this.name + '\n' +
                "Surname: " + this.surname + '\n' +
                "Position: " + this.position + '\n' +
                "Tasks: " + Arrays.toString(this.tasks) + ".\n";
    }
}
