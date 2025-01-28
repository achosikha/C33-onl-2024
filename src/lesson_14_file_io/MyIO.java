package lesson_14_file_io;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Fully buffered input -> documents, waits for the special marker EOF - end of file
 * Partially buffered input -> everything that expects special symbol '\n' - next line (console input)
 * Non-buffered input -> avoid keeping data and goes directly to the source (games)
 */
public class MyIO {
    public static void main(String[] args) {
        // I/O
        // Byte-reading (binary system)
        // Symbol (text-stream system)

        // InputStream
        // OutputStream
        // FileInputStream -> to read
        // FileOutputStream -> to write

        // Reader
        // Writer
        // FileReader -> to read
        // FileWriter -> to write

        // To work with files and directories we have main class FILE
        getFileWriter("\n\n\tI wrote this using FileWriter...");
        getFileReader();
    }

    public static void getFileWriter(String msg){
        // Writer
        try(FileWriter write = new FileWriter("src/lesson_14/readFile.txt", true)){
            write.write(msg);
        } catch (IOException e){
            System.out.println("We did not manage to write the document: " + e.getLocalizedMessage());
        }
    }

    public static void getFileReader(){
        // Reader
        try(FileReader read = new FileReader("src/lesson_14/readFile.txt")){
            int value;

            while((value = read.read()) != -1){
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println("We did not manage to read the file...");
        }
    }

    public static void writeDocumentBytesArray(String msg){
        byte[] message = msg.getBytes();

        File file = new File("src/lesson_14/readFile.txt");

        if (file.exists()){ // exists file or directory
            if (file.isFile()){ // if it is a file
                if (file.canWrite()){ // if we can write to this file
                    // new FileOutputStream(file, _rewrite or append)
                    try(FileOutputStream writeMessage = new FileOutputStream(file, true)){
                        writeMessage.write(message);
                    } catch (IOException e){
                        System.out.println("Something went wrong with the file writing..." +
                                e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    public static void writeDocument(String message){
        File file = new File("src/lesson_14/readFile.txt");

        if (file.exists()){ // exists file or directory
            if (file.isFile()){ // if it is a file
                if (file.canWrite()){ // if we can write to this file
                    // new FileOutputStream(file, _rewrite or append)
                    try(FileOutputStream writeMessage = new FileOutputStream(file, true)){
                        StringBuilder str = new StringBuilder(message);

                        int counter = 0;

                        while(str.length() > counter){
                            writeMessage.write(str.charAt(counter));
                            counter++;
                        }
                        writeMessage.flush();
                    } catch (IOException e){
                        System.out.println("Something went wrong with the file writing..." +
                                e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    public static void openDocument(File file){
        // InputStream <- FileInputStream
        // Gets File & directly address

        // try with resources
        // open the resources -> and by default, close it
        try(FileInputStream read = new FileInputStream(file)){
            // Read every single byte/integer
            int value;

            // -1 means end of the file, not EOF
            while ((value = read.read()) != -1){
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong. This is the message: " + e.getLocalizedMessage());
        }
    }

    public static void getFullListOfFilesDirectories(){
        File fileFullList = new File(".");
        String[] theList = fileFullList.list();

        Arrays.sort(theList, String.CASE_INSENSITIVE_ORDER); // do not take into consideration REGISTER

        assert theList != null;
        for (String element : theList){
            System.out.println(element);
        }

        System.out.println("-----------------------------------");
    }

    public static void getFullRelativePath(){
        // Full path - C:\Windows\Fonts\font.txt (Windows)
        // Linux - /home/.......

        // Relative: from the document in which we are ->
        // File file = new File(MyIO.class.getPackageName() + "/readFile.txt");
        File file = new File("src/lesson_14/readFile.txt");

        if (file.exists()){
            if (file.isDirectory()){
                System.out.println("This is a directory and not a regular file...");
            } else if (file.isFile()){
                System.out.println("This is a regular file to work with...");
            }
        }
    }

    public static void generalInformationOnInput() throws IOException{
        // Полубуфферизированный ввод
        System.out.print("Please enter a single value: ");
        int val = System.in.read();
        System.out.println("You have entered a value: " + (char) val);

        // Buffer -> text + enter = text + '\n'
        new Scanner(System.in).nextLine();

        System.out.print("Please enter your value: ");
        // Полубуфферизированный ввод
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str);
        scanner.close();
    }
}
