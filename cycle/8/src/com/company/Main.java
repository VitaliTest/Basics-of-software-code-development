package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = s.nextInt();
        System.out.println("Введите b: ");
        int b = s.nextInt();
        System.out.println("Цифры которые входят в число a: " + numberEnter(a));
        System.out.println("Цифры которые входят в число b: " + numberEnter(b));
    }

    public static ArrayList numberEnter(int a){
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(a > 0){
            int i = 0;
            array.add(i, a % 10);
            a = a / 10;
            i++;
        }
        return array;
    }
}
