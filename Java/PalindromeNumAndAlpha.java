package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count=12;
        for(int i=0; i<10; i++){
            for(int j=0; j<20-i; j++){
                System.out.print(" ");
            }
            for(int m=1; m<=i+1; m++){
                System.out.print(m);
            }

            for(int l=76-count; l >64; l--){
                System.out.print((char)l);
                //System.out.print(l);
            }
            count--;
//                  for(int k=1; k<11-i; k++){
//                      System.out.print(" ");
//                  }
            System.out.println("");

        }
    }
}


