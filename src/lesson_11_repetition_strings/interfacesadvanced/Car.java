package lesson_11_repetition_strings.interfacesadvanced;

public class Car implements Beep{
    @Override
    public void makeBeep() {
        System.out.println("This is a makeBeep() method without an argument...");
    }

    @Override
    public void makeBeep(String message) {
        System.out.println("This is a makeBeep(String message) and your message is: " + message);
    }

    @Override
    public void makeBeep(String message, int number) {
        System.out.println("This is a makeBeep(String message, int amount) and your message is: " + message);
        System.out.println("And your number of beeps is: " + number);
    }
}
