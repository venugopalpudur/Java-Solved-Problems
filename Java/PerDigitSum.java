package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int input1=111;
        int num=input1;
        int sum=0, digit=0, count=0;
        while(input1>0){
            digit=input1%10;
            //sum=sum+digit;
            input1=input1/10;
            count++;
        }
        for(int i=1; i<=count; i++){
            for(int j=1; j<=i; j++){
                digit=input1%10;
                sum=sum+digit;
                input1=input1/10;
                //System.out.println(digit);
                System.out.println(sum);
            }
            input1=num;
        }
        //System.out.println(sum);
    }
}
