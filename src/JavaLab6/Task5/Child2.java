package JavaLab6.Task5;

public class Child2 extends Parent {

    private String name;

    public void getData() {
        System.out.println("Enter name:");
        this.name = in.next();
    }

    public void print() {
        getData();
        super.getData();
        System.out.println("Name: " + name + ", Age: " + super.age);
    }

}
