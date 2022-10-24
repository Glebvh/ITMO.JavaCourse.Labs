package JavaLab6.Task2;

public class Banker extends Human {

    private Printable print;

    public Banker(String name, String secondName, String bankName) {
        super(name, secondName, bankName);
    }

    @Override
    public void Print() {
        System.out.println("New banker: " + name + ", " + secondName +", " + bankName);
    }
}
