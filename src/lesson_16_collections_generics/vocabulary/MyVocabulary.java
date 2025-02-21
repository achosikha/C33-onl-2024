package lesson_16_collections_generics.vocabulary;

import lesson_16_collections_generics.Cousin;
import lesson_16_collections_generics.FamilyPerson;
import lesson_16_collections_generics.Person;

import java.util.*;

public class MyVocabulary {
    public static void main(String[] args) {
        // Vocabulary

        // 1. GUI -> JavaFX

        // 2. Data storage (internal)

        // Horse -> Лощадь
        // Dog -> Собака
        // House -> Дом
        // Double ArrayList - by indexes CAN BE AND IS BETTER TO BE REPLACED BY MAP <Key, Value>

        // 3. Data storage (external)
        // FileOutputSteam
        // FileWriter
        // OLD SCHOOL (EXCEL) -> TXT
        // MAINSTREAM SCHOOL (MySQL)

        // How to get data: String[] 0 - word, 1 - translation (split)

        // RECOMMENDATION: Before Module 2, just check some basics of SQLLite
        // RECOMMENDATION: NoSQL + JSON

        // 14*(ABc):56
        // Get double array with only NUMBERS and only LETTERS

        mapVocabulary();
    }

    public static void getWord(){
        String[][] vocabulary = new String[2000][2];

        // String[0][0] - Word, String[0][1] - Translation
        System.out.print("Enter your word: ");
        String word = new Scanner(System.in).nextLine();
        System.out.print("Enter translation: ");
        String translation = new Scanner(System.in).nextLine();

        vocabulary[0][0] = word;
        vocabulary[0][1] = translation;

        // If I don't have enough I must extend
        // Capacity: if (length == 1800) array increase 1000
        // New Array = old_array + 1000 length
        // Double check duplicates
    }

    public static void vocabularyArrayList(){
        // Word - Translation
        ArrayList<String> word = new ArrayList<>();
        word.add("House");
        ArrayList<String> translation = new ArrayList<>();
        word.add("Дом");

        // Connect ???? word[?] == translation[?]
        // Duplicates? I need to check in two ArrayLists
    }

    public static void vocabularySet(){
        // Duplicates solved
        // Still two collections
        HashSet<String> word = new HashSet<>();
        HashSet<String> translation = new HashSet<>();
        word.add("House");
        word.add("Dog");
        word.add("Cat");
        word.add("Kitchen");
        word.add("Horse");
        word.add("Chicken");

        // What if I try to add already existing element
        if (word.add("House")){
            System.out.println();
        }

        System.out.println(word.add("House"));

        translation.add("Дом");
        translation.add("Собака");
        translation.add("Кошка");
        translation.add("Кухня");
        translation.add("Лощадь");
        translation.add("Курица");

        System.out.println(word);
        System.out.println(translation);
    }

    public static void mapVocabulary(){
        // MAP
        TreeMap<String, String> vocabulary = new TreeMap<>();
        vocabulary.put("Horse", "Лощадь");
        vocabulary.put("Cat", "Кошка");
        vocabulary.put("Dog", "Собака");
        vocabulary.put("Camel", "Верблюд");
        vocabulary.put("Chicken", "Курица");

        System.out.println(vocabulary.get("Horse"));

        System.out.println("Lets get all keys:");
        for (Map.Entry entry : vocabulary.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void storeObject(){
        ArrayList<Person> familyTree = new ArrayList<>();
        familyTree.add(new Person("Archil", "Teacher"));
        familyTree.add(new Cousin("Vasyli", "Cousin"));

        // Add to Collection Generic which is based on Class Inheritance
        ArrayList<FamilyPerson<Cousin>> cousins = new ArrayList<>();
    }
}