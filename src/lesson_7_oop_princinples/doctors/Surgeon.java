package lesson_7_oop_princinples.doctors;

public class Surgeon extends Doctor{
    public Surgeon(String name, String surname, int age, String position, int salary) {
        super(name, surname, age, position, salary);
    }

    @Override
    public void task() {
        System.out.println("I am a Surgeon. My task is to make operations.");
    }
}
