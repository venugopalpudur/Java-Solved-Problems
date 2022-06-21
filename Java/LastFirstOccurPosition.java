package com.company;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr1[] = new int[]{5,6,4,2,8,5,6,3,8,5,1,6};

        int temp=0,lstposition=0, fstposition=0;
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]>temp){
                    temp=arr1[i];
                    fstposition=i+1;
                }
        }
        for(int j=0; j<arr1.length; j++){
            if(arr1[j]==temp){
                lstposition=j+1;
            }
        }
        System.out.println("Max value Element is : "+temp+" ; It's Fist Occurance Position : "+fstposition+" ; It's Last Occurance Position : "+lstposition);
    }
}


















/*
class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,6,4,1,8,3,4,7,6,9};
        int temp=0,count=0;

        for(int j=0; j<arr.length; j++){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]<arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                if(arr[i] == arr[i+1]){
                    arr[i+1]=0;
                }
            }
            if(arr[j] == 0){
                count++;
            }
        }

        int tempArr[] = new int[arr.length-count];

        for(int i=0; i< arr.length; i++){
            if(arr[i] != 0){
                tempArr[i]=arr[i];
            }
        }

        System.out.println(Arrays.toString(tempArr));
    }
}

*/










/*

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

* */