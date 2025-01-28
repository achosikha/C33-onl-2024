package lesson_14_file_io;

import java.io.*;
import java.util.Scanner;

public class MyIOBasic {
    public static void main(String[] args) {
        // Input (read)
        // Output (write)
        // Basic: Byte style

        // Pathname to FILE or DIRECTORY

        fileOutputStreamBasics();
    }

    public static void fileInputStreamBasics(){
        File file;

        try{
            file = new File("src/lesson_14_file_io/readFile.txt");

            // try-with-resources: если сможет, откроет документ
            // Сам его же и закроет
            try(FileInputStream fileInputStream = new FileInputStream(file)){
                // byte-by-byte, int values
                // char-by-char, char value
                // ARRAYS

                // Read on the first elements of the array

                /*
                System.out.println((char) fileInputStream.read());
                System.out.println();
                 */

                // Read everything
                int value;

                // -1 == EOF -> END OF FILE
                // Usually, in the OS Systems -1 means the END
                while((value = fileInputStream.read()) != -1){
                    System.out.print((char) value);
                }
            } catch (FileNotFoundException e){
                System.out.println("File was not found: " + e.getMessage());
            } catch (IOException e){
                System.out.println("IOExceptionn says: " + e.getMessage());
            }
        } catch (NullPointerException e){
            System.out.println("File class failed: " + e.getMessage());
        }
    }

    public static void fileOutputStreamBasics(){
        // How to avoid FILE
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/lesson_14_file_io/readFile.txt")){
            // Pass bytes
            // Bytes can be easily turned into characters
            // str.getBytes()
            System.out.print("Please, enter a message to write in the document: ");
            String str = new Scanner(System.in).nextLine();

            fileOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e){
            System.out.println("Your file has not been found: " + e.getMessage());
        } catch (IOException e){
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
