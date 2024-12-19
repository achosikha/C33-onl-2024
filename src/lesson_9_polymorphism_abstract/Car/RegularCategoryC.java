package lesson_9_polymorphism_abstract.Car;

public class RegularCategoryC extends Regular{
    public RegularCategoryC(String company, String color, int productionYear, int maxSpeed, int minSpeed) {
        super(company, color, productionYear, maxSpeed, minSpeed);
    }

    @Override
    public void applyToChildClasses() {
        System.out.println("This method has been implemented from class RegularCategoryC.");
    }

    @Override
    public void getPreciseData() {
        //
    }
}
