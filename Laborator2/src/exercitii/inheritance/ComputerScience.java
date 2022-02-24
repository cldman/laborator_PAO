package exercitii.inheritance;

public class ComputerScience extends Faculty {

    public ComputerScience (String nume) {
        super(nume);
    }
    @Override
    public Integer getNumberOfStudents() {
        return 200;
    }
}
