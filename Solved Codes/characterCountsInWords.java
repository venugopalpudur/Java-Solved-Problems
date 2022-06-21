// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
    String str = "MalAYalam";
    str = str.toLowerCase();
    int count=0;
    int letters=97;
    while(letters<123){
    for(int i=0; i<str.length(); i++){
        int cha = str.charAt(i);
        //System.out.println(cha);
        if(cha == letters){
            count++;
        }
    }
    if(count != 0){
        System.out.println((char)letters+" - "+count);
    }
    count=0;
    letters++;
    }
    }
}