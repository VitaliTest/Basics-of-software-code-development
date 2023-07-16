package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите  любое целое положительное число");
        int a = s.nextInt();
        int i = 1, sum = 0;
        while (i <= a) {
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до " + a + " = " + sum);
    }
}






