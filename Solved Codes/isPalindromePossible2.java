import java.io.*;
import  java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int check=input1;
        boolean sts=true;
        int[] arr = new int[100];
        int lstdigit=0;
        int count=0, odd=0;
        while(input1>0){
            lstdigit = input1 % 10;
            input1 = input1/10;
            arr[lstdigit]++;
            count++;
        }

        if(count%2==0){
            for(int i=0; i<arr.length; i++){
                if(arr[i]%2!=0){
                    sts=false;
                    break;
                }
            }
        }
        if(count%2 != 0){
            for(int i=0; i< arr.length; i++){
                if(arr[i]%2!=0){
					odd++;
					if(odd>1){
                    	sts=false;
                    	break;
					}
                }
            }
        }

        if(sts)
            return 2;
        else
            return 1;

		//throw new UnsupportedOperationException("isPalinNumPossible(int input1)");
	}
}








/*
package com.company;

public class Main {

    public static void main(String[] args) {
        int input1=21251;
        int check=input1;
        boolean sts=false;
        int[] arr = new int[10];
        int lstdigit=0;
        int num=0;
        int pos=0;
        int count=0;
        while(input1>0){
            lstdigit = input1 % 10;
            num = num*10 + lstdigit;
            input1 = input1/10;
            arr[lstdigit]++;
            count++;
        }
        System.out.println(count);


        if(count%2==0){
            for(int i=0; i<arr.length; i++){
                if(arr[i]%2!=0){
                    sts=false;
                    break;
                }
            }
        }
        else{
            for(int i=0; i< arr.length; i++){
                if(arr[i]%2==0){
                    sts=false;
                    break;
                }
            }
        }

        if(sts)
            System.out.println("Palindrome Possible.");
        else
            System.out.println("No Palindrome Possible.");
    }
}





//pos = (int)Math.floor(Math.random()*(count-1+1)+1);
*/