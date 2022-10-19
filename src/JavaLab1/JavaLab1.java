//1.Выведите строки в следующем порядке:
//        Я
//        хорошо
//        знаю
//        Java.
// 2. Посчитайте результат выражения
//        ( 46 + 10 ) * ( 10 / 3 )
//        ( 29 ) * ( 4 ) * (- 15 )
// 3. В переменной number, лежит целое число 10500. В переменной result посчитайте следующее
//        выражение: (number / 10) / 10. Результат выведите на консоль.
//  4. Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел.
//  5. В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое
//        целое число нужно печатать с новой строки. Формат ввода:
//        42
//        100
//        125
//  6. Для целого числа b выполните следующие условные действия:
//        ● Если b нечетное, выведите “Нечетное”
//        ● Если b четное, выведите “Четное”
//        ● Если b четное и больше 100, выведите “Выход за пределы диапазона”
//        ! Использовать класс Scanner: int b = scanner.nextInt();

package JavaLab1;

import java.util.Scanner;

public class JavaLab1 {
    public static void main(String[] args) {
        //1
        System.out.println("Я\nхорошо\nзнаю\nJava");

        //2
        double x = ( 46 + 10 ) * ( 10 / 3 );
        int y = 29*4*-15;
        System.out.println("First result is "+ x + ", Second is " + y);

        //3
        int number = 10500;
        double result = number/10/10;
        System.out.println(result);

        //4
        double k = 3.6*4.1*5.9;
        System.out.println(k);

        //5
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int d = in.nextInt();
        int f = in.nextInt();
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

        //6
        int j = in.nextInt();
        String res = j % 2 != 0 ? "Нечетное" : (j < 100) ? "Четное" : "Недопустимый диапазон";
        System.out.println(res);
    }
}
