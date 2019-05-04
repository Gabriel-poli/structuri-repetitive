package com.company;

public class Exercitiul18 {
    public static void main(String[] args) {
        char n = 's';
        switch (n) {
            case 's':
            case 'n':
            case 'v':
            case 'e': {
                System.out.println("Caracterul reprezinta unul din punctele cardinale");
                break;
            }
            default:
                System.out.println("Caracterul nu reprezinta unul din punctele cardinale");
        }

    }
}
