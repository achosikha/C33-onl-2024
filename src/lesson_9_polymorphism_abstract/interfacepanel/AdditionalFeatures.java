package lesson_9_polymorphism_abstract.interfacepanel;

public interface AdditionalFeatures {
    // Если вы все-таки решите, но не надо, создавать переменные в интерфейсе,
    // то они всегда константы и всегда финальные.
    int VALUE = 10;
    String MESSAGE = "Interface Additional Features";

    // Добавлена возможность создания метода с базовой реализацией
    default void getMethodWithDefaultBody(){
        System.out.println("Default method from the interface AdditionalFeatures...");
    }
}