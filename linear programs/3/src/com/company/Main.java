package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение x");
        double x = s.nextDouble();
        System.out.println("Введите значение y");
        double y = s.nextDouble();
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("Значение выражения = " + z);
    }
}
