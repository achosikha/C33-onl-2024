package lesson_8_polymorphism.keyfinal;

public class InheritNote extends Note{
    public InheritNote(Person person) {
        super(person);
    }

    @Override
    public void canOverloadThisMethod() {
        super.canOverloadThisMethod();
    }
}
