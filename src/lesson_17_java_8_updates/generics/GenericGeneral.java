package lesson_17_java_8_updates.generics;

public class GenericGeneral<T> {
    T value;

    public GenericGeneral(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
