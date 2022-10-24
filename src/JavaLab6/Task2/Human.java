package JavaLab6.Task2;

public class Human implements Printable {
    protected String name;
    protected String secondName;
    protected String bankName;

    public Human(String name, String secondName, String bankName) {
        this.name = name;
        this.secondName = secondName;
        this.bankName = bankName;
    }

    @Override
    public void Print() {
        System.out.println("Новый человек: " + name + ", " + secondName +", " + bankName);
    }
}
