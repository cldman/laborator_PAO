package exercitii.inheritance;

public class Student extends Person {
    private String faculty;

    public Student(String faculty, String name, Integer age, Address address) {
        super(name, age, address);
        this.faculty = faculty;
    }
}
