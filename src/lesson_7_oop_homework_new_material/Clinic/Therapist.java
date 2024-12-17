package lesson_7_oop_homework_new_material.Clinic;

public class Therapist extends Doctors{
    public Therapist(String name, String surname, String position, String[] tasks) {
        super(name, surname, position, tasks);
    }

    @Override
    public void treatment() {
        System.out.println("I am a Therapist and I do treat users in the following way...");
    }
}
