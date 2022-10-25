package JavaLab6.Task5;

import java.util.Scanner;

public class Parent {
    protected int age;

    Scanner in = new Scanner(System.in);

    public void getData() {
        System.out.println("Enter age:");
        this.age = in.nextInt();
    }

}
