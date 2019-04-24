package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int month = 15;
                switch (month) {
                    case 1:
                month = 1;
                System.out.println("Luna ianuarie are 31 de zile");
                break;
                    case 2:
                    month = 2;
                        System.out.println("Luna februarie are, de obicei, 28 de zile");
                        break;
                    case 3:
                        month = 3;
                        System.out.println("Luna martie are 31 de zile");
                        break;
                    case 4:
                        month = 4;
                            System.out.println("Luna aprilie are 30 de zile");
                            break;
                    case 5:
                                month = 5;
                                System.out.println("Luna mai are 31 de zile");
                            break;
                    case 6:
                            month = 6;
                                System.out.println("Luna iunie are 30 de zile");
                                break;
                    case 7:
                    month = 7;
                        System.out.println("Luna iulie are 31 de zile");
                        break;
                    case 8:
                    month = 8;
                        System.out.println("Luna august are 31 de zile");
                        break;
                    case 9:
                    month = 9;
                        System.out.println("Luna septembrie are 30 de zile");
                        break;
                    case 10:
                        month = 10;
                            System.out.println("Luna octombrie are 31 de zile");
                            break;
                    case 11:
                            month = 11;
                                System.out.println("Luna noimebrie are 30 ");
                                break;
                    case 12:
                                month = 12;
                                break;
                    default:
                                    System.out.println("Valoarea introduse nu corespunde unei luni din an, introduceti un numar intre 1 si 12");
                                break;


                }
    }
}
