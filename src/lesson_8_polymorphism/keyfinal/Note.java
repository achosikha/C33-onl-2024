package lesson_8_polymorphism.keyfinal;

public class Note {
    // 1. Why variable is underlined by the compiler?
    // 1 -> answer: according to Java rules if a value of the class attribute does not change, it must be final
    // 2. if I make a variable final will it be closed for inheritance?
    // 2 -> if the class attribute is final, its value is final, nothing to do with inheritance
    private final Person person;

    public Note(Person person) {
        this.person = person;
    }

    // final method, polymorphism is blocked, one interface and one realization
    public final void cannotOverloadThisMethod(){
        System.out.println("This method is final and polymorphism is not accessible.");
    }

    // non-final method, access to polymorphism, one interface multiple realizations
    public void canOverloadThisMethod(){
        System.out.println("This method is not final and polymorphism is accessible.");
    }

    @Override
    public String toString() {
        return "People:\n" +
                "Person: \n" + this.person;
    }
}
