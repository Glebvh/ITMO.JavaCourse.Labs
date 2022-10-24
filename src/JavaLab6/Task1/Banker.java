package JavaLab6.Task1;

public class Banker extends Human {

    private String bankName;

    public Banker(String firstName, String secondName, String bankName) {
        super(firstName, secondName);
        this.bankName = bankName;
    }


    @Override
    void printMethod() {
        System.out.println("Banker {Name: " + super.firstName + ", Second Name: " + super.secondName + ", Bank: " + bankName + "}");
    }
}
