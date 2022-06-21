package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);

            /*
            *       int num = 9, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
            * */
    }
}
