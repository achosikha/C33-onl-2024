package lesson_6_oop_basic_homework;

public class MyMain {
    public static void main(String[] args) {
        ATM sberbank = new ATM("SBERBANK", true, true,
                2000, "SBERBANK");

        // Object directly used calls toString() method
        // System.out.println(sberbank) == Syste.out.println(sberbank.toString());
        System.out.println(sberbank); // toString();

        // Only car
        System.out.println("--------------------------------");
        Car car = new Car("Opel", 150);
        System.out.println(car);

        System.out.println("------------------------------------");
        System.out.println("You have SBERBANK ATM. I will pass a debit card of mine and check whether I can use it.");
        System.out.println("Is my debit card valid for " + sberbank.atmCompany + " AMT? " +
                sberbank.isYourDebitCardValid("SBERBANK"));

        sberbank.maxLimit += 200;
        System.out.println("My new SBERBANK limit equals to: " + sberbank.maxLimit);

        sberbank.maxLimitChecker(3000);
    }
}
