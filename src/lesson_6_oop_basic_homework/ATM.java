package lesson_6_oop_basic_homework;

// Object (super class)
// Object has by default methods, one of these methods is toString()
public class ATM {
    String atmCompany;
    boolean isWorking;
    boolean isAccessibleForYourDebitCard;
    double maxLimit;
    String insertedDebitCard;

    public ATM(String atmCompany, boolean isWorking, boolean isAccessibleForYourDebitCard,
               double maxLimit, String insertedDebitCard){
        this.atmCompany = atmCompany;
        this.isWorking = isWorking;
        this.isAccessibleForYourDebitCard = isAccessibleForYourDebitCard;
        this.maxLimit = maxLimit;
        this.insertedDebitCard = insertedDebitCard;
    }

    public boolean isYourDebitCardValid(String debitCard){
        return this.atmCompany.equals(debitCard);
    }

    public void maxLimitChecker(int value){
        if ((this.maxLimit + value) > 5000){
            System.out.println("You have entered an unacceptible value. You can reach only 5000 in sum." +
                    "You currently have: " + this.maxLimit);
        } else {
            this.maxLimit += value;
            System.out.println("You have added a new value " + value + ". You maximum limit is now: " + this.maxLimit);
        }
    }

    // Method override
    // Signature -> method name and passed parameters
    // public void sum(int, int)
    // public void sum (int, String);
    // public void sum (String, String, int);

    // Method overload
    // You have a default method
    // Переопределение метода - это часть полиморфизма, которые делает следующее:
    // Меняет уже существующее автоматический заданный метод на свою реализацию
    // public counter(){} -> exists;
    // public counter(){ ..... } -> переопределите
    @Override // annotation, который говорит компилятору, что у объекта есть уже вложенная реализация
    // я собираюсь поменять тело этого метода и пожалуйста проверь, есть ли такой метод, не ошибся ли я
    public String toString() {
        return "You ATM belongs to: " + this.atmCompany + "\n" +
                "Your ATM is working? " + this.isWorking + "\n" +
                "Your debit card is accepted by the ATM? " + this.isAccessibleForYourDebitCard + "\n" +
                "Your inserted card to the ATM has a maximum limit of: " + this.maxLimit + "\n" +
                "Your inserted debit card can be used? " + this.insertedDebitCard + "\n";
    }
}
