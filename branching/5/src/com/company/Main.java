package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float f, x;
        Scanner s = new Scanner(System.in);

        System.out.print("Введите x: ");
        x = s.nextFloat();
        if (x <= 3) {
            f = (float) Math.pow(x, 2) - 3 * x + 9;
        } else {
            f = (float) (1 / (Math.pow(x, 3) + 6));
        }
        System.out.print("Ответ: " + f);
    }
}
