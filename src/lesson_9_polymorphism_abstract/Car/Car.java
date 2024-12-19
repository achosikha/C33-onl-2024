package lesson_9_polymorphism_abstract.Car;

// Using keyword abstract in the class means that this class
// cannot create an instance of itself
// We tell a compiler and others that it can be only used as a basic type
// It is a general BLUEPRINT nothing more
public abstract class Car {
    private final String company;
    private final String color;
    private final int productionYear;
    private final int maxSpeed;
    private final int minSpeed;

    public Car(String company, String color, int productionYear, int maxSpeed, int minSpeed) {
        this.company = company;
        this.color = color;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }

    // If you have an abstract class you can also add an abstract method
    // Abstract method tell a compiler that only non-abstract class must implement it
    public abstract void applyToChildClasses();
    public abstract void getPreciseData();

    @Override
    public String toString() {
        return "Car: \n" +
                "\tCompany: " + this.company + '\n' +
                "\tColor: " + this.color + '\n' +
                "\tProduction year: " + this.productionYear + "\n" +
                "\tMaximum speed: " + maxSpeed + "\n" +
                "\tMinimum speed: " + minSpeed;
    }
}