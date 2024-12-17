package lesson_7_oop_homework_new_material.Clinic;

import lesson_7_oop_princinples.doctors.Doctor;

public class Clinic {
    // has a
    // Доктора
    // Пациенты
    private Doctor doctors;
    private User users;

    public Clinic(Doctor doctors, User users) {
        this.doctors = doctors;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "doctors=" + doctors +
                ", users=" + users +
                '}';
    }
}