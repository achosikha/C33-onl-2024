package lesson_11_repetition_strings.delegate;

public class Car {
    private final Noise noise = new Noise();
    private final String name;
    private final String type;

    public Car(String name, String type){
        this.name = name;
        this.type = type;
    }

    void delegateCarNoise(){
        noise.makeNoise("Welcome");
    }
}
