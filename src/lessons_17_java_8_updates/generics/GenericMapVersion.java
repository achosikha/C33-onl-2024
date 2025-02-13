package lessons_17_java_8_updates.generics;

public class GenericMapVersion <K, V> {
    K key;
    V value;

    public GenericMapVersion(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {return key;}

    public V getValue() {return value;}

    @Override
    public String toString() {
        return this.key + ": " + this.value;
    }
}
