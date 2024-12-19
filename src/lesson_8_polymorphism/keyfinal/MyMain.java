package lesson_8_polymorphism.keyfinal;

public class MyMain {
    public static void main(String[] args){
        createNote();
    }

    public static void createPerson(){
        Note[] persons = new Note[]{
                new Note(
                        new Person("Archil", "Sikharulidze", "Male",
                                36, 990333L, 2022L))
        };
    }

    public static void createNote(){
        Note finalMethods = new InheritNote(
                new Person("Archil", "Sikharulidze", "Male",
                        36, 75890880L, 58992022L));

        finalMethods.cannotOverloadThisMethod();
        finalMethods.canOverloadThisMethod();
    }
}
