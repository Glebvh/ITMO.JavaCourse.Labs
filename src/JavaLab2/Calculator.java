//1) Создать класс Calculator. У него должны быть методы:
//        -	Сумма
//        -	Деление
//        -	Умножение
//        -	Вычитание
//        Все методы должны быть перегружены и работать с тремя типами данных- double, long и int.

        package JavaLab2;

public class Calculator {
    public static int Summ(int a, int b) {
        return a + b;
    }

    public static double Summ(double a, double b) {
        return a + b;
    }

    public static long Summ(long a, long b) {
        return a + b;
    }

    public static double Div(int a, int b) {
        return a / b;
    }

    public static double Div(double a, double b) {
        return a / b;
    }

    public static double Div(long a, long b) {

        return a / b;
    }

    public static int Mult(int a, int b) {
        return a * b;
    }

    public static double Mult(double a, double b) {
        return a * b;
    }

    public static long Mult(long a, long b) {
        return a * b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

    public static double Sub(double a, double b) {
        return a - b;
    }

    public static long Sub(long a, long b) {
        return a - b;
    }
}
