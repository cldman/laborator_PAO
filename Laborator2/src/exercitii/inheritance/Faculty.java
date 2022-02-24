package exercitii.inheritance;

public abstract class Faculty {
    private String nume;

    public Faculty(String nume) {
        this.nume = nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    abstract Integer getNumberOfStudents();
}
