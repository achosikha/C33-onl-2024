package lesson_6_oop_basic;

public class Car {
    String company = "Unknown"; // 7 bytes
    String model; // 7
    String color; // 7
    String engine; // 7
    int year; // 4
    int maxSpeed; // 4
    int minSpeed; // 4
    boolean isLikeNew; // 1

    // Java compiler will add by default empty constructor
    // It will be the following: public Car(){}
    public Car(){
        model = "Unknown";
        color = "Unknown";
        engine = "Unknown";
    }

    // But if you add non-default constructor, Java compiler will not add and create default constructor
    // You must add it separately
    // Constructor for by default values
    // Constructor with parameters
    public Car(String companyName, String modelName, String colorCar, String engineCar,
               int yearCar, int maxSpeedCar, int minSpeedCar, boolean isLikeNewCar){
        company = companyName;
        model = modelName;
        color = colorCar;
        engine = engineCar;
        year = yearCar;
        maxSpeed = maxSpeedCar;
        minSpeed = minSpeedCar;
        isLikeNew = isLikeNewCar;
    }

    public Car(String companyName, String modelName, String colorCar, String engineModel){
        company = companyName;
        model = modelName;
        color = colorCar;
        engine = engineModel;
    }

    public Car(String company, String model, String color, String engine, int year){
        // this -> это ссылка на экземпляр класса
        // Если я создал экземпляр класса Машина типа Опель, Опелю выделил память под названием СС109
        // this = СС109 (адрес)
        // this.company -> СС109.company = company;
        this.company = company;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.year = year;
    }

    public void getGeneralInformation(){
        System.out.println("Your company: " + company);
        System.out.println("Your model: " + model);
        System.out.println("Your color: " + color);
        System.out.println("Your engine: " + engine);
        System.out.println("Your production year: " + year);
        System.out.println("Your car's max speed is: " + maxSpeed);
        System.out.println("Your car's min speed is: " + minSpeed);
        System.out.println("Is your car like new? " + isLikeNew);
        System.out.println("Let's check the address of the instance via this: " + this);

        System.gc();
    }
}
