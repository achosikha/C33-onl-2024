package lesson_7_oop_princinples.doctors;

public class Oculus extends Doctor{
    public Oculus(String name, String surname, int age, String position, int salary) {
        super(name, surname, age, position, salary);
    }

    @Override
    public void task() {
        System.out.println("I am an Oculus. My job is to threat eyes!");
    }
}
