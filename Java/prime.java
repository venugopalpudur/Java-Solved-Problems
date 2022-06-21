package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 5;
        int count=0;
        for (int i=1; i<=9; i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println(count);
        if (count==2){
            System.out.println("it is prime");
        }
        else{
            System.out.println("it is not prime");
        }
    }
}



/*
*  public int isPrime(int input1){
*   int count=0;
       for (int i=1; i<=input1; i++){
           if(input1%i==0){
               count++;
           }
       }

       if (count==2){
           //System.out.println("it is prime");
           return 2;
       }
       else{
            //System.out.println("it is not prime");
            return 1;
       }
       * */








/*
*
*         int factors=0;
        int count=0;
        int prime=0;
        int num=1;
        while(count!=input1){
       for (int i=1; i<=num; i++){
           if(num%i==0){
               factors++;
           }
       if (factors==2){
           count++;
           prime=i;
            }
        }
        num++;
    }
      return prime;
      * */



/*
*  int factors=0;
        int count=0;
        int prime=0;
        int num=1;
        while(input1<count){
       for (int i=1; i<=num; i++){
           if(num%i==0){
               factors++;
           }
       if (factors==2){
           count++;
           prime=num;
            }
        }
        num++;
    }
      return prime;*/



/*
* int num=1, count=0, i;
while (count < n)
{
num=num+1;
for (i = 2; i <= num; i++)
{
//determines the modulo and compare it with 0
if (num % i == 0)
{
//breaks the loop if the above condition returns true
break;
}
}
if (i == num)
{
//increments the count variable by 1 if the number is prime
count = count+1;
}
}
//prints the nth prime number
System.out.println("The " +n +"th prime number is: " + num);
}
* */