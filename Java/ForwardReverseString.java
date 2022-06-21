// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        StringBuilder reverse = new StringBuilder(str2).reverse();
        System.out.println(str1+reverse.toString()); 
    }
}