package lesson_14_file_io.serialization;

import java.io.Serializable;

// !! if serialized do not CHANGE structure of the serialized CLASS

// marker interface Serializable
public class Person implements Serializable {
    public final String name;

    // transient public final int age -> do not include int age to serialization
    public final int age;
    public final String additional;

    public Person(String name, int age, String additional){
        this.additional = additional;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", additional='" + additional + '\'' +
                '}';
    }
}
