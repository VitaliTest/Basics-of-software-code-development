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

        double z = ((a - 3) * b / 2) + c;
        System.out.println("Значение функции = " + z);



        

    }
}
