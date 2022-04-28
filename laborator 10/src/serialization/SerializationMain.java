package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {

    public static void main(String[] args) {
        Student student = new Student("Popescu", "Ion", "Automatica");

        try(ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            fout.writeObject(student);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Student studentDeserialized = null;

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            studentDeserialized = (Student) in.readObject();

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("serializable class Student not found");
            e.printStackTrace();
        }
        System.out.println("Deserialized student is:");
        System.out.println("Name: " + studentDeserialized.getName());
        System.out.println("Surname: " + studentDeserialized.getSurname());
        System.out.println("Faculty: " + studentDeserialized.getFaculty());
    }
}
