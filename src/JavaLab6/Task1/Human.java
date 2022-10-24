package JavaLab6.Task1;

public abstract class Human {
    protected String firstName;
    protected String secondName;

    public Human(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    abstract void printMethod();
}
