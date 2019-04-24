package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here Exercitiul 1

        for (int i=1;i<=4;i++)
        switch (i) {
            case 1:
                i = 1;
                System.out.print("# ");
                break;
            case 2:
                i = 2;
                System.out.print("## ");
                break;
            case 3:
                i = 3;
                System.out.print("### ");
                break;
            case 4:
                i = 4;
                System.out.print("#### ");
                break;

        }
        for (int i=3;i>=1;i--)
            switch (i) {
                case 1:
                    i = 1;
                    System.out.print("# ");
                    break;
                case 2:
                    i = 2;
                    System.out.print("## ");
                    break;
                case 3:
                    i = 3;
                    System.out.print("### ");
                    break;
                case 4:
                    i = 4;
                    System.out.print("#### ");
                    break;
            }
    }
}
