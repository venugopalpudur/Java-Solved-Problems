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
        //Collections.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
            System.out.println("Max Values: "+Arrays.toString(arr));
    }
}