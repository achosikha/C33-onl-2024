package lesson_15_io_collections;

import java.io.*;

public class MyIOMore {
    public static void main(String[] args) {
        // IO
        // Bytes
        // Characters
        // Buffered

        // System.out.println(Thread.currentThread());


        // FileInputStream
        // FileOutputStream

        // FileWriter
        // FileReader
        getFileReader();
    }

    // !!! ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ НА ТРЕНИРОВКУ СОЗДАНИЯ КАТАЛОГОВ
    // Создайте и выведите в консоли всю структуру вашего проекта TMS через FILE
    public static void getAllFiles(){
        File tmsDirectory = new File("/home/achosikha/Desktop/C33-onl-2024/src");
        File[] files = tmsDirectory.listFiles();

        // Check that files are listed and you don't get NULL
        // assert files != null
        if (files != null) {
            for (File element : files) {
                System.out.println(element.getName());
            }
        }
    }

    public static void getFileAdvanced(){
        // File
        // Указать на путь документа
        // FULL/ABSOLUTE PATH -> начиная с корневого директории и до непосредственно документа
        // LINUX: /home/achosikha/Desktop/C33-onl-2024/src/lesson_15_io_collections/read.txt
        // Windows: C:/....read.txt
        // Проблема: как только вы отправите код в другой ресурс, то все что до самого проекта будет неактуально

        // Relative PATH: ~/src/lesson_15_io_collections/read.txt
        // Система: узнай у системы или у хоста, где находится мой проект, мой загрузочный класс + отталкивайся от него
        // Возьму путь у системы + корневой путь

        // Неправильный путь к документу/директории

        File file = new File("/home/achosikha/Desktop/C33-onl-2024/src/lesson_15_io_collections/reaD.txt");

        try (FileInputStream readFile = new FileInputStream(file)) {
            // NullPointerException
            System.out.println(readFile.read());
            System.out.println("We found your file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e) {
            System.out.println("IOException:" + e.getMessage());
        }
    }

    public static void getIO(){
        // InputStream
        // OutputStream
        // Абстрактные классы, нужны их реализации, чтобы избежать самостоятельной обработки
        // Реализация типы FileInputStream, FileOutputStream

        // Characters Unicode
        // Writer & Reader threads
        // Use realization File+Reader, File+Writer
        // -1 конец документа, если ничего в документе нет будет -1, если что-то есть, данные
        // EOF -> End of Document
    }

    public static void getFileReader(){
        {
            try(
                    FileWriter write =
                            new FileWriter("/home/achosikha/Desktop/C33-onl-2024/src/lesson_15_io_collections/read.txt")){
                write.write("This is a FileWriter realization of the Writer super class...");

                // Clean buffer/stream
                write.flush();
            } catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            } catch (IOException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
