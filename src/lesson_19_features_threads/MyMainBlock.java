package lesson_19_features_threads;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMainBlock {
    public static void main(String[] args) {
        // SQL
        // Object: id, name, surname, age, position
        // class Person: User
        // -> User....
        // Generic<Person> user;
        // Generic<? extends Person> - null
        // class Administrator: User
        // class Moderator: User

        // Значение потока можно использован лишь раз, даже если он объявлен напрямую
        Stream<String> str;
    }

    public static void basicStream(){
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations
        List<String> result = listOfLists.stream()
                .flatMap(List::stream)               // Flatten the list of lists into a single stream
                .filter(s -> s.startsWith("S"))      // Filter elements starting with "S"
                .map(String::toUpperCase)            // Transform each element to uppercase
                .distinct()                          // Remove duplicate elements
                .sorted()                            // Sort elements
                .peek(s -> intermediateResults.add(s)) // Perform an action (add to set) on each element
                .collect(Collectors.toList());       // Collect the final result into a list

        // Print the intermediate results
        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println("Final Result:");
        result.forEach(System.out::println);
    }

    public static void getMyData(){
        ArrayList<String> values = new ArrayList<>();
        values.add("Vatican");
        values.add("Volgograd");
        values.add("Misnk");
        values.add("Moscow");
        values.add("Munich");

        // Создайте два отдельных ArrayList, где будет сохранены имена городов с буквой V и имена городов с буквой M
        // Нужно через Стрим, задать фильтр и значение таким образом, чтобы в новом ArrayList он сохранил только
        // определенные значения
    }
}
