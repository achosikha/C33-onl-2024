package lessons_16_collections_generics;

public class Person {
    private final String name;
    private final String relation;

    public Person(String name, String relation){
        this.name = name;
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", relation='" + relation + '\'' +
                '}';
    }
}
