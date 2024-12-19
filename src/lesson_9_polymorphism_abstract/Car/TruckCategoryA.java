package lesson_9_polymorphism_abstract.Car;

public class TruckCategoryA extends Truck{
    public TruckCategoryA(String company, String color, int productionYear, int maxSpeed, int minSpeed) {
        super(company, color, productionYear, maxSpeed, minSpeed);
    }

    @Override
    public void applyToChildClasses() {
        // From abstract Car to abstract Truck to non-abstract TruckCategoryA
        // Абстрактный метод должен быть выполнен (иметь реализацию) в первом по очереди наследования
        // не абстрактном классе.
        System.out.println("This method has been implemented from class TruckCategoryA.");
    }

    @Override
    public void getPreciseData() {
        //
    }
}
