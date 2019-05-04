package com.company;

public class Exercitiul19 {
    public static void main(String[] args) {
        long cnp = 28505131618871L;
        String[] luni = {"ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august", "septembrie", "octombrie", "noiembrie", "decembrie"};
        cnp = cnp / 10000000;
        int zi = (int) cnp % 100;
        int luna = (int) (cnp / 100) % 100;
        cnp = cnp / 100;
        int an = (int) (cnp / 100) % 100;
        int sex = (int) cnp / 10000;
        if (sex % 2 == 0) {
            System.out.print("Fata nascuta pe ");
        } else System.out.print("Baiat nascut pe ");
        System.out.print(zi + " ");
        System.out.print(luni[luna-1] + " ");
        switch (sex) {
            case 1:
            case 2: {
                an = 1900 + an;
                System.out.print(an);
                break;
            }
            case 3:
            case 4: {
                an = 1800 + an;
                System.out.print(an);
                break;
            }
            case 5:
            case 6: {
                an = 2000 + an;
                System.out.print(an);
                break;
            }
            default:
                System.out.print(" strain rezident in Romania");


        }
    }
}
