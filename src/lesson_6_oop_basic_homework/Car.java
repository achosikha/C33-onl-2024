package lesson_6_oop_basic_homework;

public class Car {
    String company;
    int speed;

    public Car (String company, int speed){
        this.company = company;
        this.speed = speed;
    }

    @Override
    public String toString(){
        return "Your car company no one cares...";
    }
}
