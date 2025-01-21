package lesson_11_repetition_strings.cloneobject;

public class Zoo implements Cloneable{
    private final String name;
    private final String type;

    public Zoo (String name, String type){
        this.name = name;
        this.type = type;
    }

    // Copy Constructor
    // Interface
    // Object = clone()

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
