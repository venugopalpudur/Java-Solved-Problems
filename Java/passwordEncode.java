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