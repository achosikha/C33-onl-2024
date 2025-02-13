package lessons_17_java_8_updates;

public class MyMain {
    public static void main(String[] args) {
        // Java 8, Java 11, Java 12, Java 7

        // Java 8 Classics, accumulates all positive sides of the previous versions
        // Java 8 + Lambda, additional Interfaces (Predicable and etc.), LocalDate, @FunctionalInterface
        // Java 8 + Stream, Optional
    }

    public static void switchOldNew(){
        String value = "apple";

        // Old style classical
        switch (value){
            case "banana":
                System.out.println("This is banana...");
                break;
            case "watermelon":
                System.out.println("This is watermelon...");
                break;
            case "apple":
            case "orange":
                System.out.println("This is an orange or an apple...");
            default:
                System.out.println("You should never reach this place.");
        }

        // New style with lambda expression
        switch (value){
            case "carrot" -> System.out.println("This is a carrot...");
            case "kiwi" -> System.out.println("This is a kiwi");
            case "apple", "orange" -> System.out.println("This is an apple or an orange");
            default -> System.out.println("You shouldn't reach this place.");
        }
    }
}
