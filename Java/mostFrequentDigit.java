package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int input1=1246503, input2=762624, input3=207846, input4=1001252;
        int m=0, position=0;
        String num = input1+""+input2+""+input3+""+input4;
        char[] ch=num.toCharArray();
        int[] arr=new int[num.length()];
        for(int i=0; i<num.length(); i++){
            if(ch[i]>='0' && ch[i]<='9'){
                arr[Character.getNumericValue(ch[i])]++;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j]>=m){
                m=arr[j];
                position=j;
            }
//            if(arr[j]==m){
//
//            }
        }
        System.out.println(position);
        System.out.println(Arrays.toString(arr));
        }
    }




