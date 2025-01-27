package lesson_13_format_exceptions_errors;

public class MyMain {
    // main entrance point - the only one, no other options
    // before initializing all other staff, create main()
    public static void main(String[] args) {
        // Format
        // Static method call non-static method()
        calculateBMI("Welcome to BMI Calculator.", 82.4, 186);
    }

    public static void getMessage(){
        // Standard Output
        System.out.println(); // ANSCII Code - \n
        System.out.print("");

        int value = 100;

        // ""
        System.out.println(value + " cm.");

        // There is nothing by default
        System.out.printf("This is my first formatted output...\n");
        System.out.printf("There is no next line...\n");

        // int, double/float, boolean, char, string
        // %d (byte -> integer), %f (float, double), %b (boolean), %c (character), %s (string)
    }

    public void getStaticMessage(){
        // Non-static method call static method()
        getMessage();
    }

    // Static belongs to class, Class.static_variable/method
    public static void calculateBMI(String msg, double weight, int height){
        System.out.printf("Initial message is: %s.\n", msg);
        System.out.printf("Your weight is: %.4f.\n",weight);
        System.out.printf("Your height is: %d.\n", height);

        double updatedHeight = (double) height/100;
        double BMI = weight/(updatedHeight * updatedHeight);

        // %. (. means set precision) how many numbers after the dot and then type
        System.out.printf("We have calculated your BMI index based on the following data:\n");
        System.out.printf("Your weight %.3f kg, your height %d cm.\n", weight, height);
        System.out.printf("Finally, your BMI index via formula - weight/ (height * height): %.3f.\n", BMI);
    }
}