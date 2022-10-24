package JavaLab6.Task2;

public class Main {
    public static void main(String[] args) {

        Banker newBanker = new Banker("ivan", "ivanov", "vtb");
        newBanker.Print();
        Client newClient = new Client("petr", "petrov", "sber");
        newClient.Print();


    }
}
