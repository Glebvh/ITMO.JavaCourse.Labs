package JavaLab6.Task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ivan", "Ivanov", "VTB");
        client.printMethod();
        Human banker = new Banker("Petr", "Petrov", "Alfabank");
        banker.printMethod();
    }
}
