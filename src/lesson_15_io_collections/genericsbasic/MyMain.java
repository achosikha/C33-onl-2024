package lesson_15_io_collections.genericsbasic;

public class MyMain {
    public static void main(String[] args) {
        GenGeneric<String> value = new GenGeneric<>("Archil");
        GenGeneric<Integer> intValue = new GenGeneric<>(145);
        GenGeneric<Character> charValue = new GenGeneric<>('A');

        NumberGeneric<Double> doubleVal = new NumberGeneric<>(456.1);
        NumberGeneric<Long> shortVal = new NumberGeneric<>(1344L);

        // Не Number NumberGeneric<String>
    }
}
