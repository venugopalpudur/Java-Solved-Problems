package com.company;


class check{

    // number should be greater than 3 or 2 digits
    static char secondLastDigit(int n){
        String str = Integer.toString(n);
        int lgt = str.length();
        char st = str.charAt(lgt-2);
        return st;
    }

//    OR---------------------------------------------

    static int lastDigi(int m){
        //m = (m / 10) % 10;
        m = (m % 100) / 10;
        return m;
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(check.secondLastDigit(156));
        System.out.println(check.lastDigi(6957));
    }
}
