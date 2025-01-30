package lesson_15_io_collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        // Code
        getLinkedList();
    }

    public static void getBasicList(){
        // List
        // <Type> -> мы не может в коллекцию передать примитивные типы
        // Для того, чтобы в коллекцию передать указатель на примитивный тип
        // Обертка класса Integer, Double, Character, Boolean, Float

        // List это базовый тип с минимальным функционалом
        // Его реализация это ArrayList and LinkedList
        // Если нам нужно больше функционала, что создавать надо на основе конкретной реализации
        List<Integer> values = new ArrayList<>(); // Общий для List и ArrayList функционал
        ArrayList<Boolean> booleanArrayList = new ArrayList<>(); // Весь функционал и от List и от ArrayList

        System.out.println(values);
        values.add(100);
        System.out.println(values);

        for (int index = 0; index < 11; index++){
            values.add((19 + 4) * index);
        }

        System.out.println(values);

        // add == append, добавить в конец массива
        // Обычный расширяемый массив, который имеет длину и объем
        // Можно удалять, вставлять по индексу или в конец
        // Как обычный массив индексируется и сохраняется очередность данных
        // List может хранить в себе дублирующиеся значения
        values.set(0, -1);
        System.out.println(values);
        System.out.println("Get the first value via index: " + values.get(0));
        System.out.println("Get the first value via getFirst(): " + values.getFirst());

        values.clear();
        System.out.println(values);
        System.out.println("Size() instead of length: " + values.size());
        values.add(9);
        System.out.println("After adding one value: " + values.size());
    }

    public static void getCarArrayList(){
        ArrayList<Car> listOfCars = new ArrayList<>();

        listOfCars.add(new Car("BMW", 310));
        listOfCars.add(new Car("Mercedes", 315));
        listOfCars.addFirst(new Car("Opeol", 180));

        for (Car element : listOfCars){
            System.out.println(element);
        }
    }

    public static void getLinkedList(){
        // LinkedList - связанный список
        // Здесь каждый элемент имеет два адреса: адрес предыдущего элемента и последующего
        LinkedList<String> stringNames = new LinkedList<>();
        stringNames.add("Archil");
        stringNames.addFirst("Ylia");
        stringNames.add("Vasya");
        stringNames.add(1, "Irina");

        for (String el : stringNames){
            System.out.println(el);
        }

        System.out.println(stringNames);

        // ArrayList вставил значение в начале, ему бы пришлось сдвигать весь массив
    }
}
