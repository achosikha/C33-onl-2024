package lesson_9_polymorphism_abstract.Car;

public class TruckCategoryB extends Truck{
    public TruckCategoryB(String company, String color, int productionYear, int maxSpeed, int minSpeed) {
        super(company, color, productionYear, maxSpeed, minSpeed);
    }

    @Override
    public void applyToChildClasses() {
        System.out.println("This method has been implemented from class TruckCategoryB.");
    }

    @Override
    public void getPreciseData() {
        //
    }
}
