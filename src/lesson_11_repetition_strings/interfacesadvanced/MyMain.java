package lesson_11_repetition_strings.interfacesadvanced;

public class MyMain {
    public static void main(String[] args) {
        Beep car = new Car();

        car.makeBeep();
        System.out.println("-------------------------------------------------------------------");
        car.makeBeep("Beep");
        System.out.println("-------------------------------------------------------------------");
        car.makeBeep("Beep, beep, beep", 3);
        System.out.println("-------------------------------------------------------------------");
        car.makeBeep("Beep, beep", 2, "You have only two BEEPS.");
    }
}
