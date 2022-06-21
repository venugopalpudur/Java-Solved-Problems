package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count=9;
        for(int i=0; i<19; i++){
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

            System.out.println("");

        }
    }
}

