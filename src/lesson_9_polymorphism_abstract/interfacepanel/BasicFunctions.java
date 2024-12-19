package lesson_9_polymorphism_abstract.interfacepanel;

// Классическая цель интерфейса - это тотальная абстракция
// Никаких аттрибутов данных, переменных, реализаций
// Лишь указания того, что мы можем делать - методы, на языке С++
// Только указываем прототипы функций
public interface BasicFunctions {
    void turnOn();
    void turnOff();
    void start();
    void stop();
}