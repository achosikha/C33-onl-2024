package lesson_17_java_8_updates.generics;

import lesson_17_java_8_updates.generics.person.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyGenerics {
    public static void main(String[] args) {
        // Generics
        genericsPassList();
    }

    public static void genericsPassList(){
        GenericsSuper<Double> genericDouble = new GenericsSuper<>(178.1);
        genericDouble.setNewValue(new ArrayList<>());
        genericDouble.setNewValue(new LinkedList<>());
    }

    public static void storePersons(){
        GenericPerson<Person> person = new GenericPerson<>(new Men("Archil", "Male", 36));
        GenericPerson<Men> vasya = new GenericPerson<>(new Men("Vasily", "Male", 40));
        GenericPerson<Women> olya = new GenericPerson<>(new Women("Olya", "Female", 24));
        GenericPerson<BlackWomen> blackNiki = new GenericPerson<>(new BlackWomen("Niki", "Female", 18));
    }

    public static void extendsGeneric(){
        GenericsExtends<ArrayList<String>> genericArrayList = new GenericsExtends<>(new ArrayList<>());
        GenericsExtends<LinkedList<String>> genericLinkedList = new GenericsExtends<>(new LinkedList<>());
        // GenericsExtends<HashSet<String>> genericHashSet = new GenericsExtends<>(new HashSet<>());
    }

    public static void putCollectionsToGeneric(){
        GenericMapVersion<ArrayList<String>, ArrayList<String>> genericArrayList =
                new GenericMapVersion<>( new ArrayList<>(), new ArrayList<>());

        genericArrayList.key.add("Dog");
        genericArrayList.key.add("Monkey");
        genericArrayList.key.add("Chicken");
        genericArrayList.value.add("Собака");
        genericArrayList.value.add("Осел");
        genericArrayList.value.add("Курица");

        System.out.println(genericArrayList.key);
        System.out.println(genericArrayList.value);
    }

    public static void imitateMapArray(){
        GenericMapVersion<String, String>[] mapImitation = new GenericMapVersion[]{
                new GenericMapVersion<>("Cat", "Кошка"),
                new GenericMapVersion<>("Dog", "Собака"),
                new GenericMapVersion<>("Horse", "Лощадь"),
                new GenericMapVersion<>("Monkey", "Обезьяна"),
                new GenericMapVersion<>("Donkey", "Осел")
        };

        for (GenericMapVersion el : mapImitation){
            System.out.println(el);
        }

        System.out.println("****************************************");
        for (int index = 0; index < mapImitation.length; index++){
            System.out.printf("Under key[%d]: %s.\n", index, mapImitation[index].key);
            System.out.printf("Stored value[%d]: %s.\n\n", index, mapImitation[index].value);
        }
    }

    public static void duplicateMapViaGeneric(){
        GenericMapVersion<String, String> mapImitation = new GenericMapVersion<>("Dog", "Собака");
        System.out.println(mapImitation);
    }

    public static void getGenericGeneral(){
        GenericGeneral<Integer> intGeneric = new GenericGeneral<>(100);

        // To set F, D or 109.4
        GenericGeneral<Double> doubleGeneric = new GenericGeneral<>(109.6);
        GenericGeneral<Character> charGeneric = new GenericGeneral<>('A');
        GenericGeneral<String> stringGeneric = new GenericGeneral<>("Welcome");

        System.out.println(intGeneric);
        System.out.println(doubleGeneric);
        System.out.println(charGeneric);
        System.out.println(stringGeneric);

        charGeneric.setValue('Y');
        System.out.println(charGeneric.getValue());
    }
}
