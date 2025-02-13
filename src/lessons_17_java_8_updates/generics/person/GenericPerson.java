package lessons_17_java_8_updates.generics.person;

public class GenericPerson <T extends Person> {
    T person;

    public GenericPerson(T person){
        this.person = person;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
