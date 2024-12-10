package lesson_5_multi_arrays;

import java.util.Arrays;

public class MultiArrays {

    public static void main(String[] args){
        declareTwoDimensionalArray();
    }

    public static void declareTwoDimensionalArray(){
        char[][] letters = new char[][]{
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I', 'R'},
                {'R', 'O'},
                {'G', 'H', 'I', 'R', '+', '\\'},
        };

        char[][] lettersTwo = new char[][]{
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I', 'R'},
                {'R', 'O'},
                {'G', 'H', 'I', 'R', '+', '\\'},
        };

        printArrayEnhanced(letters);

        System.out.println(Arrays.deepEquals(letters, lettersTwo));

        System.out.println("----------------------------------------------------");
        getCubeArray();
    }

    public static void printArrayClassic(char[][] letters){
        for (int outer = 0; outer < letters.length; outer++){
            for (int inner = 0; inner < letters[outer].length; inner++){
                System.out.print(letters[outer][inner]);
            }
            System.out.println();
        }
    }

    public static void printArrayEnhanced(char[][] letters){
        for (char[] letter : letters){
            for (char el : letter){
                System.out.print(el);
            }
            System.out.println();
        }
    }

    public static void getCubeArray(){
        int[][][] numbers = new int[][][]{
                {
                        {1, 5, 10},
                        {-1, 10, 19}
                },
                {
                        {9, -101, 19},
                        {100, 0, 0, 0, -1}
                }
        };

        for (int[][] outer : numbers){
            for (int[] inner : outer){
                for (int deeper : inner){
                    System.out.println(deeper);
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        for (int outer = 0; outer < numbers.length; outer++){
            for (int inner = 0; inner < numbers[outer].length; inner++){
                for (int deeper = 0; deeper < numbers[outer][inner].length; deeper++){
                    System.out.println(numbers[outer][inner][deeper]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
