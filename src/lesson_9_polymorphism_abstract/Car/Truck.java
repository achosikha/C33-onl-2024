package lesson_9_polymorphism_abstract.Car;

public abstract class Truck extends Car{
    public Truck(String company, String color, int productionYear, int maxSpeed, int minSpeed) {
        super(company, color, productionYear, maxSpeed, minSpeed);
    }
}