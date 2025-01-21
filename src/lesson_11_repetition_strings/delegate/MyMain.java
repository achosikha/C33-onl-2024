package lesson_11_repetition_strings.delegate;

public class MyMain {
    public static void main(String[] args) {
        Car car = new Car("BMW", "GH-1");
        car.delegateCarNoise();
    }
}
