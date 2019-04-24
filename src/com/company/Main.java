package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here Exercitiul 1

        int N = 9;
        if (N % 2 == 1) {
            System.out.print("Numarul este impar, noul numar este:");
            N = N * 3 + 1;
        } else {
            System.out.print("Numarul este par, noul numar este: ");
            N = N / 2;
        }
        System.out.print(N);
    }
}