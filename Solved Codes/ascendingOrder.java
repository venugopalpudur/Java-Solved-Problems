package com.company;

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,6,4,1,8,3,4,7,6,9};
        int temp=0;
        for(int j=0; j<arr.length; j++){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
