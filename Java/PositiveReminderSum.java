package com.company;

class check{
    static int sum(int a, int b){
        a = Math.abs(a%10);
        b = Math.abs(b%10);
        int sum = a+ b;
        return sum;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(check.sum(-128,-55));
    }
}
