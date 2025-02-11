package lessons_16_collections_generics.vocabulary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

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

        vocabularySet();
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
    }
}