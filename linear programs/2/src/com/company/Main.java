package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение a");
        double a = s.nextDouble();
        System.out.println("Введите значение b");
        double b = s.nextDouble();
        System.out.println("Введите значение c");
        double c = s.nextDouble();

        double z = ((b + Math. sqrt(Math.pow(b, 2) + 4 * a * c))/(2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Значение выражения = " + z);

    }
}
