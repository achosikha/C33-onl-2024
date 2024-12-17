package lesson_8_polymorphism.ConstructorDelegate;

public class Car {
    private final String name;
    private String company;
    private String color;
    private final int speed;
    private static int carCounter; // int carCounter belongs to CAR, not to its instances
    private int nonStaticCounter;

    public Car (String name){
        this(name, "Unknown", "Unknown");
    }

    public Car (String name, String company){
        this (name, company, "Unknown");
    }

    public Car (String name, String company, String color){
        this.name = name;
        this.company = company;
        this.color = color;
        carCounter++;
        nonStaticCounter++;
        this.speed = 0;
    }

    public final void getMsg(){
        System.out.println("This is your message....");
    }

    // static method
    public static int getCarCounter(){
        return carCounter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public int getNonStaticCounter() {
        return nonStaticCounter;
    }
}
