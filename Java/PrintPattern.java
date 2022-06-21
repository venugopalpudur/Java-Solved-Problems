package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        System.out.println("------------------------------------------------------------ ");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 11 - i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        System.out.println("------------------------------------------------------------ ");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10- i; j++) {
                    System.out.print(" ");
            }
            for (int m=1; m <=i; m++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("------------------------------------------------------------ ");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10- i; j++) {
                System.out.print(" ");
            }
            for (int m=1; m <=i; m+=1 ){
                System.out.print(i);
            }
            for (int k=i-1; k >=1; k-- ){
                System.out.print(k);
            }
            System.out.println(" ");
        }


    }
}
