package com.company;

public class Exercitiul17 {
    public static void main(String[] args) {
        int n = 1212121212;
        int m = 0;
        int sumapare = 0;
        int sumaimpare = 0;
        while (n != 0) {
            sumaimpare = sumaimpare + (n % 10);
            sumapare = sumapare + ((n % 100) / 10);
            n = n / 100;
        }
        m = sumapare - sumaimpare;
        System.out.println(" Suma cifrelor de pe pozitii pare minus suma cifrelor de pe pozitii impare este " + m);
    }
}
