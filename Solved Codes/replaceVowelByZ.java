// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String str="Hello";
        char vowel;
        StringBuilder stri = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                stri.setCharAt(i,'z');
            }
            else{
                System.out.println("No Vowel Present.");
            }
        }
        System.out.println(stri);
    }
}