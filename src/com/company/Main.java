package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here Exercitiul 3 rev.2 - final
        int N = 6;
        int contor = 0;
        while (N != 1) {
            if (N % 2 == 1) {
                N = N * 3 + 1;
                contor++;
            } else {
                N = N / 2;
                contor++;
            }


        }
        System.out.println(contor);
    }
}