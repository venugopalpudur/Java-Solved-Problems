import java.io.*;
import  java.util.*;

class----------{
method-------{
	int check=input1;
		int lstdigit=0;
		int num=0;
		while(input1>0){
			lstdigit = input1 % 10;
			num = num*10 + lstdigit;
			input1 = input1/10;
		}
		if(num==check){
			return 2;
		}
		else{
			return 1;
		}
		
	}
}