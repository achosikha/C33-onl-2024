package lesson_7_oop_princinples.doctors;

public class MyClinic {
    public static void main(String[] args) {
        // Doctors
        Doctor[] doctors = new Doctor[]{
                new Dentist("Archil", "Sikharulidze", 36, "Dentist", 5679),
                new Oculus("Kiril", "Yashin", 56, "Oculus", 4350),
                new Oculus("Okasana", "Lopatina", 39, "Oculus", 4589),
                new Surgeon("Igor", "Smirnov", 41, "Surgeon", 9871),
        };

        /*
        System.out.println(doctors[0]);
        System.out.println(doctors[1]);

         */

        System.out.println("-------------------------------");
        for (Doctor doctor : doctors){
            System.out.println(doctor);
            doctor.task();
            System.out.println("--------------------------------");
        }
    }

    public static void createDoctors(){
        Doctor doctor = new Doctor("Unknown", "Unknown", 30, "Unknown", 0);
        System.out.println(doctor);
        doctor.task();

        System.out.println("-------------------------------------------------------------------");
        Doctor surgeonArchil = new Surgeon
                ("Archil", "Sikharulidze", 36, "Surgeon", 1500);
        System.out.println(surgeonArchil);
        surgeonArchil.task();

        System.out.println("--------------------------------------------------------------------");
        Doctor dentist = new Dentist("Ylia", "Yashin", 45, "Dentist", 5000);
        System.out.println(dentist);
        dentist.task();
    }
}
