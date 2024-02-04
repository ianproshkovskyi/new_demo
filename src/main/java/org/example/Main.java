package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        hello("world");
        hello("Ian");
        hello("Tanya");

        int t = 5;
        double l = 5.0;
        System.out.println("Площадь квадрата " + t + " = " + area(l));


        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!`");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}
