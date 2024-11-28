package lesson_4_arrays;

import java.util.Random;

public class MyArrays {
    public static void main(String[] args){
        // Array
        copyArray();
    }

    public static void copyArray(){
        int[] numbers = new int[]{9, 91, 9, 100, -1, 10};

        int[] numbersTwo = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++){
            numbersTwo[index] = numbers[index];
        }

        for (int number : numbersTwo){
            System.out.println(number);
        }

        System.out.println("-----------------------------------");
        int[] numbersThree = new int[20];

        for (int index = 0; index < numbers.length; index++){
            numbersThree[index] = numbers[index];
        }

        for (int number : numbersThree){
            System.out.println(number);
        }
    }

    public static void declareInitializeAlltogether(){
        // Declaration
        // Memory allocation
        // Initialization
        char[] letters = new char[]{'a', 'C', '/', '4', '8'};

        for (char letter : letters){
            System.out.println(letter);
        }

        // No precise values known
        String[] names = new String[10];

        for (int index = 0; index < names.length; index++){
            names[index] = "Abc";
        }

        for (String name : names){
            System.out.println(name);
        }
    }

    public static void setValues(){
        int[] numbers = new int[10];

        // Class for random numbers
        // Упрощенная версия от класса Math - это повторение того же что и в других языка программирования
        // Math нуждается в формуле, Random нет
        Random random = new Random();

        for (int index = 0; index < numbers.length; index++){
            // random.nextInt(от 0 до 100, максимум 99)
            numbers[index] = random.nextInt(0, 100);
        }

        for (int el : numbers){
            System.out.println(el);
        }
    }

    public static void readArray(){
        int[] values = new int[]{1, 2, 3};

        // Protects from data re-writing
        for (int el : values){
            System.out.println(el);
        }
    }

    public static void createInitializeArray(){
        // Declaration
        double[] values;

        // memory allocation
        // double 8 bytes
        // values array 8 x 10 = 80 bytes
        values = new double[10];

        // initialization - set values
        values[0] = 10;
        values[1] = 12.4;
        values[2] = 8.1;

        // index < values.length; -> length ровно такая длина, сколько элементов
        // но количества индексов от 0 по длина - 1
        // Classical for is for read and write - R, W
        for (int index = 0; index < values.length; index++){
            System.out.println(values[index]); // direct access via indexes
        }

        // set new values
        for (int index = 0; index < values.length; index++){
            values[index] = index;
        }

        // enhanced-for
        // Переменная эл эта временная единица, где хранятся значения из массива values
        // Only for R
        System.out.println("-------------------------");
        for (double el : values){ // no direct access, just values stored and read
            System.out.println(el);
        }

        for (double el : values){ // no direct access, just values stored and read
            el = 10;
        }

        System.out.println("-------------------------------------");
        for (double el : values){ // no direct access, just values stored and read
            System.out.println(el);
        }
    }

    public static void basicInfoArray(){
        // Если нам нужно сохранить определенное количество однотипных значений
        // Самый простой выход это создать - цепочку и использовать
        // 1. Цепь состоит из минимум одного элемента и уже дальше по желанию;
        // 2. Если цепочка есть, то у нее должна быть длина
        // 3. Цепочка состоит из отдельных элементов, а это значит, что мы должны иметь доступ к каждому из элементу
        // 4. Каждый элемент имеет свою нумерацию, 1..2..3..4..5, но в массиве нумерацию начинается с 0
        // 5. В массиве, как обычной цепочке, нумерация начинается с 0, который указывает на первый элемент
        // 6. Если у меня 10 элементов в цепочке, то 1 элемент будет под номером 0, 10 будет под 9-ым номером
        // 7. В Джава компилятор автоматически проверяет правильность вашей нумерации, и если он видит, что вы
        // пытаетесь указать на несуществующий номер - будет ошибка компиляции;
        // 8. Узнать автоматически длину массива, длина - length, размер - size, Java массив это length;
        // 9. Массив это самый оптимизированный и быстрый формат хранения примитивных данных.

        // У массива есть природные ограничения:
        // 1. Фиксированная длина в Джаве; если вы хотите, увеличить длину массива, то вы должны создать новый и
        // скопировать туда данные;
        // 2. однотипность - массива типа ИНТ, там все должно быть типа ИНТ, если СТРИНГ, то только СТРИНГ

        // Массив (цепочку) из чисел типа ИНТ, объект, но по другим стандартам;
        // Массив это объект, чье имя указывает на первый элемент
        // Массив с именем numbers -> numbers указывает на первый элемент (его адрес) вашей цепочки:
        // В Джаве хотя имя массива и является указателем, адресом на первый элемент, но его прямо так нельзя
        // использовать, нельзя сдвигать адреса, нельзя вообще работать с массивом через адреса, только через нумерацию

        // C-style array declaration
        int numbers[] = new int[]{1, 2, 3};

        // Java style array
        // Four elements, length 4, indexes from 0 to 3
        String[] names = new String[]{"Polina", "Igor", "Sergey", "Vadim"};

        // Нумерация элемента называется индекс
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        // Exception: ArrayIndexOutOfBoundsException
        // System.out.println(names[4]);
    }
}
