package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите начальное значение ");
        int m = s.nextInt();
        System.out.println("Введите конечное значение ");
        int n = s.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.println("делители числа " + i);

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    System.out.println(j);
                }
            }
        }
    }
}



