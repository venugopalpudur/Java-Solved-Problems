package com.company;

class check{
    static char lastDigit(int n){
       String str = Integer.toString(n);
       int lgt = str.length();
       char st = str.charAt(lgt-1);
        return st;
    }

//    OR---------------------------------------------

    static int lastDigi(int m){
       m = m % 10;
       return m;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(check.lastDigi(56985821));
        System.out.println(check.lastDigi(569644892));
    }
}
