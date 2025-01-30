package lesson_15_io_collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MySet {
    public static void main(String[] args) {
        // Set
        // Не позволяет хранить повторяющиеся элементы !!!
        // Нет упорядоченности
        // HashSet, 4, 10, 1, -1 (хранится как угодно, без порядка и сортировки)
        // TreeSet, 10, -1, 2 (хранится он тоже будет неуопорядоченно, отсортирован по возрастанию) -1, 2. 10
        getBasicLinkedHashSet();
    }

    public static void getBasicHashSet(){
        // Хранит хеш-коды
        // Отсутствует упорядоченность, т.е. никаких индексов
        // Не может иметь одинаковые значения
        HashSet<Character> symbols = new HashSet<>();

        for (int index = 65; index < 75; index++){
            symbols.add((char) index);
        }

        System.out.println(symbols);
        symbols.add('&');
        System.out.println(symbols);
        symbols.add('*');
        System.out.println(symbols);

        // Если вы пытаетесь вставить значение, которого нет, он вставит и вернет true
        // Если же это значение есть, то ничего не сделает, а просто выведет false
        System.out.println(symbols.add('!'));
        System.out.println(symbols.add('*'));
        System.out.println(symbols);
    }

    public static void getBasicLinkedHashSet(){
        // Связанного списка - хранит адреса
        // Хешов - уникальные значения
        // Set - не позволяет повторяющиеся значения

        // В нем есть упорядоченность по вставке
        LinkedHashSet<Double> values = new LinkedHashSet<>();
        values.add(19.5);
        values.add(35.0);
        values.add(49.0);
        values.add(1.1);

        System.out.println(values);
    }
}
