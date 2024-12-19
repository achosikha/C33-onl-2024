package lesson_9_polymorphism_abstract.interfacepanel;

// Interfaces были созданы для высшей степени абстракции, где даны лишь действия без реализаций
// Также, благодаря interfaces мы достигаем имитацию множественного наследования
// Множественное наследование через классы, как в С++ в Джаве запрещены.
// Наследование происходит через ключевое слово extends, а интерфейсы внедряются через
// ключевое слово implements, можно указать целый перечень через запятую
public abstract class Panel implements BasicFunctions, AdvancedFunctions, AdditionalFeatures{
    private String name;

    public Panel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}