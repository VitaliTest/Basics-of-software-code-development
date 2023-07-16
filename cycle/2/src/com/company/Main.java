package com.company;

public class Main {

    public static void main(String[] args) {
        int a = -5;
        int b = 10;
        int h = 3;
        int y;

        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = x * (-1);
            }
            System.out.println("При х = " + x + " у = " + y);
        }
        System.out.println();
    }
}
