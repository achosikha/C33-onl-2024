package lesson_7_oop_homework_new_material;

// import classes from another package
// чтобы импортировать весь пакет, после названия пакета, ставим точку,
// после точки звездочку и точку с запятой.
import lesson_7_oop_homework_new_material.Clinic.*;
import lesson_7_oop_homework_new_material.PC.*;
import lesson_7_oop_princinples.doctors.Surgeon;

public class MyMain {
    public static void main(String[] args){
    }

    public static void buildPC(){
        PC i9GhK1 = new PC(new Processor("i9", "Ghk1", 3.2),
                           new VGA("Radeon", "JK1", 1024),
                           new RAM("Intel", "DDR5", 32),
                           new Cooler("KL-8", 500, "KLEON", "KL"));

        System.out.println(i9GhK1);
    }

    public static void buildClinic(){
        Clinic clinic = new Clinic(
                new Surgeon("Archil", "Sikharulidze", 36, "Surgeon", 5000),
                                    new User("Ylia", "Yashin",
                                            new Dentist("Vova", "Dantist", "Dentist",
                                                    new String[]{"Treat teeth", "Take out teeth"})));
    }
}
