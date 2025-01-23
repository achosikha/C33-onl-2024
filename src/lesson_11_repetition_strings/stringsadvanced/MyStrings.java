package lesson_11_repetition_strings.stringsadvanced;

import java.security.spec.RSAOtherPrimeInfo;

public class MyStrings {
    public static void main(String[] args) {
        char[] myNameChar =
                new char[]
                        {'A', 'c', 'h', 'i', 'l', ' ', 'S', 'i', 'k', 'h', 'a', 'r', 'u', 'l', 'i', 'd', 'z', 'e'};

        // Difference between char array and the string is that the last one has a special character that tells
        // compiler that this is the end of the string = '\0'

        // If string is a set of char letters, size equals to all elements of the array and + '\0'
        // Archil Sikharulidze + '\0' -> 20 bytes, char is 1 byte
        String myName = "Archil Sikharulidze"; // Archil Sikharulidze + '\0'
        String mySurname = new String("Sikharulidze");

        String concatViaPlus = "Welcome" + myName + "with surname: " + mySurname;
        String concatIntegerString = 25 + 25 + "Archil " + 25.6;

        // If you need to make a calculator to protect yourself use priority tools (5 + 4)
        String concatIntegerString2 = 25 + 25 + "Archil " + 25.6 + 25.6; // 25 + 25 (50) + Archil = 50Archil25.625.6

        String concatIntegerStringAdvanced = Double.toString(25.6 + 25);
        String charToString = 'a' + 'B' + "";
        String charToStringAdvanced = Character.toString('a');

        System.out.println(concatViaPlus);
        System.out.println(concatIntegerString);
        System.out.println(concatIntegerString2);
        System.out.println(concatIntegerStringAdvanced);

        String buttonOne = "1";
        String buttonTwo = "2";
        String buttonThree = "3";

        double buttonOneDouble = Double.parseDouble(buttonOne);
        double buttoneTwoDouble = Double.valueOf(buttonTwo);

        // -------------------------------------------------------------
        String isEmpty = ""; // isEmpty
        String isSpace = " "; // Symbol space from ASCII
        String useThisString = "String without NEW";
        String neverUseSuchString = new String("Never Use Such Declaration");

        String archil = "Archil";
        String vasya = "Archil";

        // hashCode unique, if there is the same hashCode memory is almost the same
        System.out.println(archil.hashCode());
        System.out.println(vasya.hashCode());
        // equals() -> content "Archil" == "Archil"
        System.out.println(archil.equals(vasya));

        // String POOL
        // String POOL checks if there is the same value
        // If yes, it just allocates the same address and does not create new memory space
        // When we compare objects using == -> we compare addresses
        // If two objects have the same address they have the same values, the same memory
        System.out.println((archil == vasya));

        String nikita = new String("Archil");
        System.out.println("HasCodes: ");
        System.out.println(archil.hashCode());
        System.out.println(vasya.hashCode());
        System.out.println(nikita.hashCode());

        System.out.println("Equals(): ");
        System.out.println(archil.equals(nikita));
        System.out.println(vasya.equals(archil));
        System.out.println(nikita.equals(vasya));

        System.out.println("Addresses: ");
        System.out.println((archil == vasya));
        System.out.println((archil == nikita)); // Address archil != address nikita
        System.out.println((vasya == nikita)); // Address vasya != address nikita

        String isEmptyCheck = " ";

        System.out.println(isEmptyCheck.isEmpty()); // if empty "" - true, else false

        String isNull = null; // initialization with an empty address

        System.out.println(isNull); // there is no address, no value, nothing
    }
}