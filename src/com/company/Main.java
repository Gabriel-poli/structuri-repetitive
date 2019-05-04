package com.company;

public class Main {

    public static void main(String[] args) {
        // Exercitiul 10 Suma numere pare vector
        int[] unArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int contor = 0;
        int suma = 0;
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] % 2 == 0) {
                suma = suma + unArray[i];
                contor++;
            }
            if (contor == 5) {
                break;
            }


        }
        System.out.println("Suma primelor 5 numere pare din vector este: " + suma);

    }
}
