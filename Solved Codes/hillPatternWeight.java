

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



