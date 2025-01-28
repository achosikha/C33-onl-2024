package lesson_13_format_exceptions_errors;

// Наследуюсь от супер класса Exception
// Получаю его методы, его конструктор
public class LengthException extends Exception{
    public LengthException(String msg){
        super(msg);
    }
}
