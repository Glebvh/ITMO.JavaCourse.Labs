package JavaLab6.Task5;

import java.util.Scanner;

public class Parent {
    private int age;

    Scanner in = new Scanner(System.in);

    public void getData(int age) {
        this.age = in.nextInt();
    }

}
