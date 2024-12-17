package lesson_7_oop_homework_new_material.Clinic;

public class Dentist extends Doctors{
    public Dentist(String name, String surname, String position, String[] tasks) {
        super(name, surname, position, tasks);
    }

    @Override
    public void treatment() {
        System.out.println("I am a Dentist and I do treat people in the following way...");
    }
}
