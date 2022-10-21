package JavaLab4.part1;

import java.util.Arrays;
import java.util.Scanner;

public class firstPartMain {
    public static void main(String[] args) {

        int[] array = new int[]{3, 88, 88, 3, 5, 88, 99, 88, 3};
        //1.1
//        MethodOne();
        //1.2
//        MethodTwo();
        //1.3
//        MethodThree();
        //1.4
//        MethodFour();
        //1.5
        MethodFive(array);
        //1.6
//        MethodSix(array);
    }

    //	Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
    //	Каждое число печатается с новой строки
    public static void MethodOne() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5). Пример вывода:
    //	Делится на 3: ….
    //	Делится на 5: ….
    //	Делится на 3 и на 5: ….
    public static void MethodTwo() {
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                System.out.println("Делится на 3: " + j);
            }
            if (j % 5 == 0) {
                System.out.println("Делится на 5: " + j);
            }
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + j);
            }
        }
    }

    //Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
    // если сумма равна третьему целому числу. Пример вывода:
    //Введите первое число: 5
    //Введите второе число: 10
    //Введите третье число: 15
    //Результат: true
    public static void MethodThree() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert first number");
        int c = in.nextInt();
        System.out.println("Insert second number");
        int d = in.nextInt();
        System.out.println("Insert result");
        int f = in.nextInt();
        if (f == c + d) {
            System.out.println("Result is true");
        } else System.out.println("Result is false");
    }

    //Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
    // если второе число больше первого числа, а третье число больше второго числа. Пример вывода:
    //Введите первое число: 5
    //Введите второе число: 10
    //Введите третье число: 15
    //Результат: true
    public static void MethodFour() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert first number");
        int c = in.nextInt();
        System.out.println("Insert second number");
        int d = in.nextInt();
        System.out.println("Insert third number");
        int f = in.nextInt();
        if (d > c && f > d) {
            System.out.println("Result is true");
        } else
            System.out.println("Result is false");
    }

    //Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
    // Длина массива должна быть больше или равна двум. Пример вывода:
    //array = 3, -3, 7, 4, 5, 4, 3
    //true
    public static void MethodFive(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));
        if (array.length >= 2 && array[0] == 3 && array[array.length-1] == 3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    //Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
    public static void MethodSix(int[] array) {
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

