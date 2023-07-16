package com.company;

public class Main {

    public static void main(String[] args) {
        double R= 643.142;
        double result = (R * 1000) % 1000 + (int) R / 1000.0;
        System.out.println("Полученное значение числа = " + result);
    }
}
