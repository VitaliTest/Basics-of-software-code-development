package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x,y,z,w,h;

        Scanner s = new Scanner(System.in);

        System.out.println("Кирпич:");
        System.out.print("x="); x=s.nextInt();
        System.out.print("y="); y=s.nextInt();
        System.out.print("z="); z=s.nextInt();

        System.out.println("Отверстие:");
        System.out.print("w="); w=s.nextInt();
        System.out.print("h="); h=s.nextInt();

        if ((x<=w && y <=h) || (y<=w && x<=h) ||
                (x<=w && z <=h) || (z<=w && x<=h) ||
                (z<=w && y <=h) || (y<=w && z<=h))
            System.out.println("Проходит");
        else
            System.out.println("Не проходит");
    }
}
