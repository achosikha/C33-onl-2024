package lesson_14_file_io.serialization;

import java.io.*;

// ДОПОЛНИТЕЛЬНО:

// Сами создайте класс Компьютер, используя паттерн композиция
// После этого, проведите сериализацию экземпляра класса
// После, десериализуйте его и выводите на экран

// *** Создайте массив экземпляров класса Компьютер и сериализуйте его;
// *** Создайте возможность не переписывания данных в документе, а дополнения данных.
public class ReadWriteObject {
    public static void main(String[] args) throws IOException {
        // ObjetOutputStream (serialization), writeObject()
        // ObjectInputStream (deserialization), readObject()
        // To enable class to serialize add marker interface Serializable

        Person archil = new Person("Archil", 35, "Just staff");

        System.out.println(archil);

        serializeObject(archil);

        System.out.println("-------------------------------------");


        Person archil2 = (Person) deserializeObject();
        System.out.println(archil2);

        // When you have deserialization -> do not change class structure
        // if you want to avoid some attributes included use key transient
    }

    public static void serializeObject(Person person) throws IOException {
        File file = new File("/home/achosikha/Desktop/C33-onl-2024/src/lesson_14_file_io/serialization/person.txt");

        // Basic method to serialize object instance is ObjectOutputStream
        // ObjectOutputStream принимает FileOutputStream, где указан адрес документа
        ObjectOutputStream writeObject = new ObjectOutputStream(new FileOutputStream(file));
        writeObject.writeObject(person);
    }

    public static Object deserializeObject() {
        File file = new File("src/lesson_14/serideser/person.txt");

        try {
            return new ObjectInputStream(
                    new FileInputStream("/home/achosikha/Desktop/C33-onl-2024/src/lesson_14_file_io/serialization/person.txt")).readObject();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return (Object) new Person("Unknown", 0, "Unknown");
    }
}
