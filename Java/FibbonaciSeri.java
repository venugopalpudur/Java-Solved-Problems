package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int m=10;
        int fib=1;
        int prev=0;
        int pres=1;
        for (int i =1; i<=10; i++){
            System.out.println(fib);
            fib = prev+pres;
            prev=pres;
            pres=fib;
        }


        /*
           int n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }


    OR

       int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    while (i <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

      i++;
    }


    OR


       int n = 100, firstTerm = 0, secondTerm = 1;

    System.out.println("Fibonacci Series Upto " + n + ": ");

    while (firstTerm <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

    }
        */
    }
}
