package JavaLab6.Task5;

public class Child2 extends Parent {

    private String name;

    public void getData() {
        System.out.println("Enter name:");
        this.name = in.next();
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

}
