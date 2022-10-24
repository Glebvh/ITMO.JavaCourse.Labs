package JavaLab6.Task1;

public class Client extends Human {
    private String bankName;

    public Client(String firstName, String secondName, String bankName) {
        super(firstName, secondName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        String firstName1 = super.firstName;
        String secondName1 = super.secondName;
        return "Client {Name: " + firstName1 + ", Second Name: " + secondName1 + ", Bank: " + bankName + "}";
    }

    @Override
    void printMethod() {
        System.out.println(toString());
    }
}
