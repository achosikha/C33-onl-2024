package lesson_16_collections_generics;

// Обобщение это класс, который может принимать как значение любой объект
// На него можно накладывать ограничения с использованием вайлкардс
public class FamilyPerson <T extends Person> {
    T person;
}