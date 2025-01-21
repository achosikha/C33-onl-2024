package lesson_11_repetition_strings.delegate;

public class Noise {
    void makeNoise(String message){
        if (message.equals("Welcome")){
            System.out.println("You have welcomed the user...");
        } else {
            System.out.println("Your message is: " + message);
        }
    }
}