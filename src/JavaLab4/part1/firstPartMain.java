package JavaLab4.part1;

import java.util.Arrays;
import java.util.Scanner;

public class firstPartMain {
    public static void main(String[] args) {
        //1.1
//        MethodOne();
//        //1.2
//        MethodTwo();
//        //1.3
//        MethodThree();
//        //1.4
//        MethodFour();
//        //1.5
//        MethodFive();
        //1.6
        MethodSix();
    }
    public static void MethodOne(){
        for (int i = 1;i <= 100; i++){
            System.out.println(i);
        }
    }

    public static void MethodTwo(){
        for (int j = 1;j <= 100; j++) {
            if (j % 3 == 0)
            {
                System.out.println("Делится на 3: " + j);
            }
            if (j % 5 == 0){
                System.out.println("Делится на 5: " + j);
            }
            if (j % 3 == 0 && j % 5 == 0){
                System.out.println("Делится на 3 и на 5: " + j);
            }
        }
    }

    public static void MethodThree(){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert first number");
        int c = in.nextInt();
        System.out.println("Insert second number");
        int d = in.nextInt();
        System.out.println("Insert result");
        int f = in.nextInt();
        if (f == c + d){
            System.out.println("Result is true");
        } else System.out.println("Result is false");
    }

    public static void MethodFour(){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert first number");
        int c = in.nextInt();
        System.out.println("Insert second number");
        int d = in.nextInt();
        System.out.println("Insert third number");
        int f = in.nextInt();
        if (d > c && f > d){
            System.out.println("Result is true");
            } else
                System.out.println("Result is false");
    }
    public static void MethodFive(){
        int[] array = new int[5];
        array[0] = 3;
        array[1] = 777;
        array[2] = 999;
        array[3] = 666;
        array[4] = 3;
        System.out.println("Array = " + Arrays.toString(array));
        if (array[0] == 3 && array[4] == 3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void MethodSix() {
        int[] array = new int[] {66,88,88,5,88,99,88,1};
        Boolean result = false;
        for (int i : array) {
            if (i == 1 || i == 3) {
                result = true;
                break;
            }
        }
        if (result == true)
            System.out.println("Array is true");
        else
            System.out.println("Array is false");
    }
}

