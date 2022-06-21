package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        long fact=1;
        Scanner sc = new Scanner(System.in);
        int scc = sc.nextInt();
        for(int i = 1; i<=scc; i++){
            fact *=i;
        }
        System.out.println(fact);


        /*
               int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        */

        /*
             int num = 5, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        */
    }
}

