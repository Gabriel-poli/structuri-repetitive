package com.company;

public class Exercitiul11 {

    // varianta if else
    public static void main(String[] args) {
        int n = 5;
        if (n == 0) {
            System.out.println("zero");
        } else if (n == 1) {
            System.out.println("unu");
        } else if (n == 2) {
            System.out.println("doi");
        } else if (n == 3) {
            System.out.println("trei");
        } else if (n == 4) {
            System.out.println("patru");
        } else if (n == 5) {
            System.out.println("cinci");
        } else if (n == 6) {
            System.out.println("sase");
        } else if (n == 7) {
            System.out.println("sapte");
        } else if (n == 8) {
            System.out.println("opt");
        } else if (n == 9) {
            System.out.println("noua");
        } else
            System.out.println("numar gresit");


        // varianta switch

        int m = 11;
        switch (m) {
            case 1:
                System.out.println("unu");
                break;
            case 2:
                System.out.println("doi");
                break;
            case 3:
                System.out.println("trei");
                break;
            case 4:
                System.out.println("patru");
            case 5:
                System.out.println("cinci");
                break;
            case 6:
                System.out.println("sase");
                break;
            case 7:
                System.out.println("sapte");
                break;
            case 8:
                System.out.println("opt");
                break;
            case 9:
                System.out.println("noua");
                break;
            default:
                System.out.println("numar gresit");
        }
    }
}