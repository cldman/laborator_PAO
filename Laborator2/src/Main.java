import exercitii.Primitives;
import exercitii.inheritance.Address;
import exercitii.inheritance.ComputerScience;
import exercitii.inheritance.Faculty;
import exercitii.inheritance.PhoneImpl;
import exercitii.inheritance.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);

        String myObj = scanner.nextLine();
        System.out.println("Hello " + myObj);

        int value = Primitives.publicValue;


        Address studentAddress = new Address("firstStr", 10);
        Student student = new Student("Faculty", "Jhon", 20, studentAddress);

        System.out.println(student.getName());
        System.out.println(student.getAdress().getStr());


        PhoneImpl myPhone = new PhoneImpl();
        myPhone.setNumber(23);
        System.out.println("phone number is" + myPhone.getNumber() + "and prefix " + myPhone.getPrefix());

        Faculty myFaculty =  new ComputerScience("ComputerScience");
        System.out.println(((ComputerScience) myFaculty).getNumberOfStudents());

    }


}
