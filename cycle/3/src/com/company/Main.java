package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов чисел от 1 до 100 равна " + sum);
    }
}
