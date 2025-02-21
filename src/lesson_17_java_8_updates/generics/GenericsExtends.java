package lesson_17_java_8_updates.generics;

import java.util.List;

// extends ... означает, что должно быть в рамках Коллекции (все, что внутри)
// Нельзя другой класс, интерфейс или же по уровню выше
public class GenericsExtends <T extends List> {
    T value;

    public GenericsExtends(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
