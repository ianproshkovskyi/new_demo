package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        hello("world");
        hello("Ian");
        hello("Tanya");

        Square s = new Square(5);
        System.out.println("Площадь квадрата " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!`");
    }

}
