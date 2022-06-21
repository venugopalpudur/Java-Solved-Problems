package com.company;

import java.util.*;

class Main {

    public static void main(String[] args) {

        Integer[] arr=new Integer[10];
        Scanner sc = new Scanner(System.in);
        
        int count=0, score=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        while(score<101){
            for(int j=0; j<arr.length; j++){
                    if(arr[j]==score){
                        count++;
                    }
                }
                System.out.println("Score of "+score+"' is :"+count);
                score++;
                count=0;
            }
            //System.out.println("Max Values: "+Arrays.toString(arr));
    }
}