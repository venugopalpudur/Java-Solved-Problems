class HelloWorld {
    public static void main(String[] args) {
	boolean val=false;
		if(input1<0){
			val = true;
		}
		 int sum = 0;
		 input1=Math.abs(input1);
 
        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (input1 > 0 || sum > 9)
        {
            if (input1 == 0) {
                input1 = sum;
                sum = 0;
            }
            sum += input1 % 10;
            input1 /= 10;
        }

		if(val){
        return -1*sum;
		}
		else{
			return sum;
		}

}
}












/*

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        int input1=25785189;

		 int sum = 0;
		 input1=Math.abs(input1);
 
        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (input1 > 0 || sum > 9){
         if (input1 == 0){
             input1=sum;
             sum=0;
         }
    
            sum = sum + input1%10;
            input1=input1/10;
            //System.out.println(input1);
        
        }
        System.out.println(sum);
    }  
}

*/