package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here Exercitiul 4
        int[] vector = {5, 3, 14, 17, 8, 5, 23};
        int nrpar = 0;
        int nrimpar = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                nrpar++;
            } else {
                nrimpar++;
            }

        }
        System.out.println("Exista " + nrpar + " numere pare si " + nrimpar + " numere impare");
    }
}