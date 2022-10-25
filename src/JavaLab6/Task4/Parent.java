package JavaLab6.Task4;

import java.util.Scanner;

public class Parent {

    protected int i;

    public void setNum() {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        this.i = in.nextInt();
    }

}
