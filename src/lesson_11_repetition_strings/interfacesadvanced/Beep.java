package lesson_11_repetition_strings.interfacesadvanced;

public interface Beep {
    String name = "String";

    void makeBeep();
    void makeBeep(String message);
    void makeBeep(String message, int number);

    default void makeBeep(String message, int number, String finalMessage){
        // create a DEFAULT realization for the method makeBeep
        System.out.println("You have a message: " + message);
        System.out.println("You made a " + number + " of beeps.");
        System.out.println("Your final message is: " + finalMessage);
    }
}