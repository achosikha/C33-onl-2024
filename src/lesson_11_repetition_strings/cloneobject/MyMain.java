package lesson_11_repetition_strings.cloneobject;

public class MyMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Zoo zoo1 = new Zoo("Zoo-I", "Closed");
        Zoo zoo2 = (Zoo) zoo1.clone();
    }
}
