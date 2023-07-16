package com.company;

public class Main {

    public static void main(String[] args) {
	int T = 12345;
    int ch = T / 3600;
    int m = (T - (ch * 3600)) / 60;
    int s = T - ch * 3600 - m * 60;
        System.out.println(ch + " часа, " + m + " минут, " + s + " секунд");
    }
}
