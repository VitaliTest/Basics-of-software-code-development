package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 1;
        int i = 1;
        while (i <= 200) {
            a *= i * i;
            i++;
        }
        System.out.println("Произведение квадратов чисел от 1 до 200 = " + a);
    }
}
