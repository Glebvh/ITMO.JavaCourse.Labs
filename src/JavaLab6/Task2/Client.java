package JavaLab6.Task2;

public class Client extends Human {

    public Client(String name, String secondName, String bankName) {
        super(name, secondName, bankName);
    }

    @Override
    public void Print() {
        System.out.println("New client: " + name + ", " + secondName +", " + bankName);
    }
}
