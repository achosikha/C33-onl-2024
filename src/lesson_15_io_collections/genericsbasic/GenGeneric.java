package lesson_15_io_collections.genericsbasic;

public class GenGeneric<T> { // Type
    T value;

    public GenGeneric(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "ClassNumber{" +
                "value=" + value +
                '}';
    }
}
