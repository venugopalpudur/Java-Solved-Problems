package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

        /*
            char c = 'A';

        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";

        System.out.println(output);
         */

        /*
           // declare a variable
        char c = 'a';

        // checks if c is an alphabet
        if (Character.isAlphabetic(c)) {
        System.out.println(c + " is an alphabet.");
        }
        else {
        System.out.println(c + " is not an alphabet.");
        */
    }
}
