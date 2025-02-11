package lessons_16_collections_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyMain {
    public static void main(String[] args) {
        // MAP словарь
        // Ключ-Обозначение
        // Ключи должны быть уникальными
        // K - ключ (unique), V - значение (могут быть разными, одинаковыми)

        // Для словаря
        // Расшираеямая коллекция
        // Есть возможность обойтись одной коллекцией
        // Есть возомжность обойти стороной проверку слов, ключи могут быть только уникальными

        createHashMap();
    }

    public static void createHashMap() {
        HashMap<String, String> vocabulary = new HashMap<>();
        vocabulary.put("Dog", "Собака");
        vocabulary.put("Cat", "Кошка");
        vocabulary.put("Horse", "Лощадь");
        vocabulary.put("Donkey", "Осел");
        vocabulary.put("Monkey", "Обезьяна");
        vocabulary.put("Shark", "Акула");
        vocabulary.put("Turtle", "Черепаха");
        vocabulary.put("Alligator", "Аллигатор");
        vocabulary.put("Bird", "Птица");
        vocabulary.put("Bat", "Летучая Мышь");

        System.out.println(vocabulary);

        vocabulary.put(null, null);
        vocabulary.put("Tiger", null); // I don't know translation yet

        System.out.println(vocabulary);


    }

    public static void canNullBeAdded(){
        // ArrayList can be added
        ArrayList<String> canIAddNull = new ArrayList<>();
        canIAddNull.add(null); // no point

        // Set cannot keep non-unique values
        // Can be put null but only once
        HashSet<String> stringHashSet = new HashSet<>();

        System.out.println(stringHashSet.add(null));
        System.out.println(stringHashSet.add("Archil"));
        System.out.println(stringHashSet.add("Sergey"));
        System.out.println(stringHashSet.add(null));

        System.out.println(stringHashSet);
    }
}
