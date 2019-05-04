package com.company;

public class Exercitiul16 {
    public static void main(String[] args) {
        int n = 1212121212;
        int sumacifre = 0;
        while (n != 0) {
            sumacifre = sumacifre + ((n % 100) / 10);
            n = n / 100;

        }
        System.out.println("Suma cifrelor de pe pozitii pare ale numarului este " + sumacifre);

    }

}
