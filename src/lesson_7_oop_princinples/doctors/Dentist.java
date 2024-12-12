package lesson_7_oop_princinples.doctors;

public class Dentist extends Doctor{
    public Dentist(String name, String surname, int age, String position, int salary) {
        // If you decide to use super constructor it must be first in the order
        super(name, surname, age, position, salary);
    }

    @Override
    public void task() {
        System.out.println("I am a Dentist. My job is to treat teeth.");
    }
}
