package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here Exercitiul 3
        int[] Karray = {5, 6, 2, 13, 8, 14, 99};
        int numar = -32000;
        for (int i = 0; i < Karray.length; i++)
            if (Karray[i] % 2 == 1) {
                if (Karray[i] > numar) {
                    numar = Karray[i];
                } else {
                }
            }
        if (numar == -32000) {
            System.out.println("NO");
        } else {
            System.out.println("Cel mai mare numar impar este:  " + numar);
        }

    }
}