package lessons_17_java_8_updates.generics;

import java.util.List;
import java.util.Set;

public class GenericsSuper <T extends Number> {
    T value;

    public GenericsSuper(T value){
        this.value = value;
    }

    // Any value Integer above (Number hierarchy)
    public void setNewValue(List<? super Integer> list){
        // Method arguments SUPER
        // Minimum above something
    }

    @Override
    public String toString() {
        return super.toString();
    }
}