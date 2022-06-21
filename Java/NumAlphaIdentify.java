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











/*
public class Main {
    public static void main(String[] args) {
        String str = "All Zebras are black & white!!";
        int sum=0, chr=0,input2=0;
        str = str.toLowerCase();
        System.out.println(str);
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='a' && ch[i]<='z'){
                //System.out.println((int) ch[i]+" "+(int)'a');
                if(ch[i] =='a' || ch[i] =='e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u'){
                        if(input2==0) {
                            sum = sum + 0;
                        }
                        else{
                            sum = sum + ch[i]-'a'+1;
                        }
                }
                else{
                    chr = ch[i]-'a'+1;
                    sum = sum+ch[i]-'a'+1;
                    System.out.println(ch[i]+"-"+chr);
                }
            }
        }
        System.out.println(sum);
        }
    }
*/









/*
public class Main {
    public static void main(String[] args) {
        String input1="MADam";
        StringBuffer str = new StringBuffer(input1.toLowerCase());
        StringBuffer palin = str.reverse();
        String s=palin.toString();
        System.out.println(s);
        System.out.println(input1);
        if(input1.toLowerCase().equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
*/





/*
public class Main {

    public static void main(String[] args) {
        String m="madam";
        String upper="";
        String[] word=m.split(" ");
        if(word.length > 1){
            upper = word[1].toUpperCase();
            System.out.println(upper);
        }
        else{
            System.out.println("LESS");
        }
    }
}
*/














/*
public class Main {

    public static void main(String[] args) {
        int input1=4, input2=1, input3=5;
        int sum=0,even=0;
        boolean start=true;
        for(int i=1; i<input1+1; i++){
            //for(int j=1; j<i+1; j++){
                sum=sum+input2*i+even*i;
                if(start){
                    even=input3;
                    start=false;
                }
                even=input3*i;
                System.out.println(even);
            //}
        }
        System.out.println(sum);
    }
}
*/









/*
public class Main {

    public static void main(String[] args) {

        int input1=190,input2=267,input3=853;
        int digit1=0,digit2=0,digit3=0,min=0,max=0;
        int pass=0, count=1;

        while(input1>0){
            digit1=input1%10;
            digit2=input2%10;
            digit3=input3%10;
            min= Math.min(digit1, digit2);
            if(count==1){
                max=digit2;
            }
            max= Math.max(digit1,max);
            max= Math.max(digit3,max);
            min= Math.min(digit3, min);
            pass=pass+min*count;
            input1=input1/10;
            input2=input2/10;
            input3=input3/10;
            count=count*10;
            System.out.println(max);
        }

        System.out.println(pass+max*1000);
    }
}
*/




//pos = (int)Math.floor(Math.random()*(count-1+1)+1);