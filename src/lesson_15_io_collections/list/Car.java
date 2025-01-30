package lesson_15_io_collections.list;

public class Car {
    private final String name;
    private final int speed;

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public void getMessage(){
        System.out.println("This is a message from the Car instance...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
