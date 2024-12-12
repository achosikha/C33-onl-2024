package lesson_7_oop_princinples;

public class MyMain {
    public static void main(String[] args) {
        PC i9Legion = new PC("i9", 32, 5000, "JK-900", "Radeon GH-786");

        System.out.println(i9Legion);
        System.out.println("---------------------------------");
        i9Legion.setProcessor("i7 MODIFIED");
        System.out.println(i9Legion.getProcessor());
        System.out.println("---------------------------------");
        System.out.println(i9Legion);
        System.out.println("---------------------------------");
        i9Legion.setCooler("JK2000 UPDATED");
        i9Legion.setHdd(1500);
        System.out.println("My updated cooler is: " + i9Legion.getCooler());
        System.out.println("My updated hdd is: " + i9Legion.getHdd());
        i9Legion.callHiddenMethod();
    }
}
