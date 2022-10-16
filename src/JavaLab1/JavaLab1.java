package JavaLab1;

import java.util.Scanner;

public class JavaLab1 {
    public static void main(String[] args) {
        //1
        System.out.println("Я\nхорошо\nзнаю\nJava");

        //2
        int x = ( 46 + 10 ) * ( 10 / 3 );
        int y = 29*4*-15;
        System.out.println("First result is "+ x + ", Second is " + y);

        //3
        int number = 10500;
        int result = number/10/10;
        System.out.println(result);

        //4
        double k = 3.6*4.1*5.9;
        System.out.println(k);

        //5
        Scanner in = new Scanner(System.in);
//        int c = in.nextInt();
//        int d = in.nextInt();
//        int f = in.nextInt();
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(f);

        //6
        int j = in.nextInt();
        String res = j % 2 != 0 ? "Нечетное" : (j % 2 == 0 && j < 100) ? "Четное" : "Недопустимый диапазон";
        System.out.println(res);
    }
}
