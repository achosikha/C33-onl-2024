package lesson_14_file_io.serialization;

import java.io.*;

public class ReadWriteObject {
    public static void main(String[] args) throws IOException {
        Person archil = new Person("Archil", 35, "Just staff");

        System.out.println(archil);

        serializeObject(archil);

        System.out.println("-------------------------------------");

        Person archil2 = (Person) deserializeObject();
        System.out.println(archil2);

        // When you have deserialization -> do not change class structure
        // if you want to avoid some attributes included use key transient
    }

    public static void serializeObject(Person p) throws IOException {
        File file = new File("src/lesson_14/serideser/person.txt");
        ObjectOutputStream writeObject = new ObjectOutputStream(new FileOutputStream(file));
        writeObject.writeObject(p);
    }

    public static Object deserializeObject() {
        File file = new File("src/lesson_14/serideser/person.txt");

        try {
            return new ObjectInputStream(new FileInputStream("src/lesson_14/serideser/person.txt")).readObject();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return (Object) new Person("Unknown", 0, "Unknown");
    }
}
