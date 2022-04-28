package serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private final String name;
    private final String surname;
    private final transient String faculty;


    public Student(String name, String surname, String faculty) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }
}
