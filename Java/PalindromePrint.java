package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
            int count=9;
              for(int i=0; i<10; i++){
                  for(int j=0; j<20-i; j++){
                      System.out.print(" ");
                  }
                  for(int m=1; m<=i+1-1; m++){
                      System.out.print(m);
                  }

                  for(int l=10-count; l>0; l--){
                      System.out.print(l);
                  }
                  count--;
//                  for(int k=1; k<11-i; k++){
//                      System.out.print(" ");
//                  }
                  System.out.println("");

              }
    }
}












/*
*   long count=10;
                long inc=1;
                for(int i=0; i<10; i++){
                    for(int j=0; j<i-1; j++){
                        System.out.print("");
                    }
                    inc=inc+count;
                    count=count*10;
                    System.out.println(inc*inc);
        }
* */