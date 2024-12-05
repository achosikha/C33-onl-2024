package lesson_5_multi_arrays;

public class MethodParameters {
    public static void main(String[] args) {
        int integerNumber = 100;
        double doubleNumber = 200;
        boolean isFalse = false;
        char letter = 'A';

        printArray(integerNumber, doubleNumber, isFalse, letter, args);

        System.out.println("From the MAIN");
        System.out.println(integerNumber);
        System.out.println(doubleNumber);
        System.out.println(isFalse);
        System.out.println(letter);

        System.out.println("-------------CLOSE--------------------");
        getVarArgs(123, false, 'a', 'b', 'c', 'd', 'e');
        System.out.println("-------------CLOSE---------------------");

        int[] numbers = new int[5];
        numbers = printReturnArray(10, 11, 12, -1, 99);

        System.out.println("----");
        for (int el : numbers){
            System.out.println(el);
        }
    }

    // &, * -> none
    public static void printArray(int integerNumber, double doubleNumber,
                                  boolean isFalse, char letter, String[] args){
        System.out.println(integerNumber);
        System.out.println(doubleNumber);
        System.out.println(isFalse);
        System.out.println(letter);

        integerNumber += 100;
        doubleNumber -= 154.1;
        isFalse = true;
        letter = 'C';

        System.out.println(integerNumber);
        System.out.println(doubleNumber);
        System.out.println(isFalse);
        System.out.println(letter);

        System.out.println("------------------------ARGS-------------------------");
        for (String element : args){
            System.out.println("Element:" + element);
        }
    }

    // Тип_переменной... имя -> передай неопределенное количество данных типа char, varargs
    public static void getVarArgs(int number, boolean isTrue, char... letters){
        System.out.println(number);
        System.out.println(isTrue);

        printVarArgs(letters);
    }

    // char[] letters = char... letters in method parameters
    public static void printVarArgs(char[] letters){
        for(char el : letters){
            System.out.println(el + "\t");
        }
    }

    // varargs must be always in the end of the parameters or if it is the only parameter
    public static int[] printReturnArray(int... numbers){
        for (int element : numbers){
            System.out.println(element);
        }

        for (int index = 0; index < numbers.length; index++){
            numbers[index] += index * 2;
        }

        return numbers;
    }
}
