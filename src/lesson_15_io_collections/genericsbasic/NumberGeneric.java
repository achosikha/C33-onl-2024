package lesson_15_io_collections.genericsbasic;

// Задал ограничение все, что Number
public class NumberGeneric <T extends Number> {
    T value;

    public NumberGeneric(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
