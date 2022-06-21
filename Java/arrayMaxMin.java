package com.company;

import java.util.*;

import java.util.*;

class Main {

    public static void main(String[] args) {

        Integer[] arr=new Integer[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<3; i++){
            System.out.println("Min Values: "+arr[i]);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0; i<3; i++){
            System.out.println("Max Values: "+arr[i]);
        }
        
            //System.out.println("Max Values: "+Arrays.toString(arr));
    }
}














/*
import java.util.Scanner;
import java.util.Arrays; 

class HelloWorld {
   
    public static void main(String[] args) {
	
    int[] arr=new int[10];
    Scanner sc = new Scanner(System.in);
    
    for(int i=0; i<10; i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0; i<3; i++){
        Arrays.sort(arr);
        System.out.println("Min Values: "+arr[i]);
    }
    for(int i=0; i<3; i++){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Max Values: "+arr[i]);
    }
    }
    }
*/