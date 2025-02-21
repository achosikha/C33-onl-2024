package lesson_19_features_threads.annotationLombok;

public class Person {
    private final String name;
    private final String surname;
    private final String age;

    // Library LOMBOK
    // @Constructor
    // Создаст все конструкторы, все геттеры, все сеттеры и у вас будет просто класс с данными
    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
