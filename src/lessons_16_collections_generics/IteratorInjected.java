package lessons_16_collections_generics;

import java.util.*;

public class IteratorInjected {
    public static void main(String[] args) {
        useCollection();
    }

    public static void useCollection(){
        // Collection == Object
        Collection<String> generalized = new ArrayList<>();
        generalized.add("Archil");

        Collection<Character> letters = new LinkedHashSet<>();
        letters.add('a');
        letters.add('k');
        letters.add('P');

        System.out.println(letters);
        Iterator<Character> iterator = letters.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void useIterator(){
        // Use Iterator
        ArrayList<String> names = new ArrayList<>();
        names.add("Archil");
        names.add("Sergey");
        names.add("Olga");
        names.add("Vasliy");
        names.add("Oxana");
        names.add("Misha");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){ // hasNext() -> проверяет есть ли следующий элемент
            System.out.println(iterator.next()); // берет элемент и переходит на следующий
        }

        // Enhanced-for
        for (String el : names){
            System.out.println(el);
        }

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(109);

        // Указывает на первый адрес вашей коллекции
        // Смещает указатель на следующий элемент
        // В конце цикла указывает на конец вашей коллекций
        // Если не обновить адрес, то останется на последнем элементе
        Iterator<Integer> integerIterator = linkedHashSet.iterator();

        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        integerIterator = linkedHashSet.iterator(); // обновил адрес указателя

        // if we don't have values and use do while - error
        do {
            System.out.println(integerIterator.next());
        } while(integerIterator.hasNext());
    }
}
