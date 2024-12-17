package lesson_7_oop_homework_new_material.Clinic;

public class Surgeon extends Doctors {
    public Surgeon(String name, String surname, String position, String[] tasks) {
        super(name, surname, position, tasks);
    }

    @Override
    public void treatment() {
        System.out.println("I am a Surgeon and I do treat users in the following way...");
    }
}
