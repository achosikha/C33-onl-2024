package lesson_8_polymorphism.Animals;

public class Animals {
    private String animal;
    private String name;
    private String color;
    private int age;

    public Animals(String animal, String name, String color, int age) {
        this.animal = animal;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void makesNoise(){
        System.out.println("This is general class Animal and it must be overloaded in a child class.");
    }

    // Polymorphism
    // Знает, что у Супер Объекта Object есть автоматически реализуемый метод toString()
    // У нас класс Animals, как и любой объект наследуется от Object и получает автоматическую реализацию метода
    // toString(); изменение поведения метода (не изменение сигнатуры) влечет за собой процесс переопределения
    // аннотация @Override указывает компилятору, что он должен посмотреть есть ли у родительского класса Animals
    // т.е. у класса Object метод с указанной сигнатурой (сигнатура - это название метода и его параметры, включая
    // количество и тип данных).
    @Override
    public String toString() {
        return "Animals: \n" +
                "Animal: " + this.animal + '\n' +
                "Name: " + this.name + '\n' +
                "Color: " + this.color + '\n' +
                "Age: " + this.age + "\n";
    }
}
