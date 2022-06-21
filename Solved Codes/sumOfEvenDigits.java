// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        int input1=2852;
        int digit;

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
     
            digit = input1%10;
            
            if (digit%2 == 0){
                //System.out.println(digit);
            sum = sum + digit;
              //System.out.println(sum);
            }
         
            
            input1=input1/10;
            //System.out.println(input1);
        
        }
        System.out.println(sum);
    }  
}




















/*
int digit;

		 int sum = 0;
		 //input1=Math.abs(input1);
 
        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (input1 > 0 ){

     
            digit = input1%10;
            
            if (digit%2 == 0){
                //System.out.println(digit);
            sum = sum + digit;
              //System.out.println(sum);
            }
         
            
            input1=input1/10;
            //System.out.println(input1);
        
        }
        return sum;
 
}
    

*/










/*

sum of even odd based on user input as input2 argument





		int digit;

		 int sum = 0;
		 //input1=Math.abs(input1);
 
        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (input1 > 0 ){

     
            digit = input1%10;
            
            if (digit%2 == 0 && input2.equals("even")){
            sum = sum + digit;
            }
			if (digit%2 != 0 && input2.equals("odd")){
				sum = sum + digit;
			}
         
            
            input1=input1/10;
            //System.out.println(input1);
        
        }
        return sum;
 

		//throw new UnsupportedOperationException("EvenOddDigitsSum(int input1,String input2)");
	}
}

*/