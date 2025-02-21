package lesson_19_features_threads.annotationLombok;

public class User extends Person{
    public User(String name, String surname, String age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
