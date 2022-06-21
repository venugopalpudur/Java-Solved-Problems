		int digit=0;
		int num=0, sum=0;
		while(input1>0){
			digit=input1%10;
			sum=sum+(int)Math.pow(digit, num);
			num=digit;
			input1=input1/10;
		}
		return sum;