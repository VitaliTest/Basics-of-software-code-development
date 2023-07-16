package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 1;
        double e = 0.1, result = 0;
        while (Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n)) >= e) {
            result += 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            n++;
        }
        System.out.print("Сумма = " + result);
    }
}
