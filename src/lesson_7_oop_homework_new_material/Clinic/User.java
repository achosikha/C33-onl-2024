package lesson_7_oop_homework_new_material.Clinic;

public class User {
    private String name;
    private String surname;
    private Doctors doctors;

    public User(String name, String surname, Doctors doctors) {
        this.name = name;
        this.surname = surname;
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "User: " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}
