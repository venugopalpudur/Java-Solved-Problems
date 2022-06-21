package com.company;

 class check{
    static int EvenOdd(int n){
        if (n%2 == 0){
            return 2;
        }
        return 1;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here



        System.out.println(check.EvenOdd(20));
    }
}
