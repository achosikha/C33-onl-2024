package lesson_9_polymorphism_abstract.Car;

public abstract class Regular extends Car{
    public Regular(String company, String color, int productionYear, int maxSpeed, int minSpeed) {
        super(company, color, productionYear, maxSpeed, minSpeed);
    }
}