package com.company;

public class Exercitiul15 {
    public static void main(String[] args) {
        int n = 21;
        int m = 12;
        int inversn = 0;
        while (n != 0) {
            inversn = inversn * 10 + (n % 10);
            n = n / 10;
        }
        if (inversn == m) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
