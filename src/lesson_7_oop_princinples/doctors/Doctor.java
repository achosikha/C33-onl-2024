package lesson_7_oop_princinples.doctors;

public class Doctor {
    private String name;
    private String surname;
    private int age;
    private String position;
    private int salary;

    public Doctor(String name, String surname, int age, String position, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public void task(){
        System.out.println("This is general method that explains what Doctor does...");
    }

    @Override
    public String toString() {
        return "Doctor:\n" +
                "Name = " + this.name + "\n" +
                "Surname = " + this.surname + '\n' +
                "Age = " + this.age + "\n" +
                "Position = " + this.position + '\n' +
                "Salary = " + this.salary + "\n";
    }
}
