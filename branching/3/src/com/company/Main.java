package com.company;

public class Main {

    public static void main(String[] args) {
        double x1=1, y1=1;
        double x2=6, y2=6;
        double x3=4, y3=4;

        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)){
            System.out.println("точки лежат на одной прямой");
        }
        else {
            System.out.println("точки не лежат на одной прямой");
        }

    }
}
