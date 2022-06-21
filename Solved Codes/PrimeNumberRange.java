// program to find the prime numbers between range 
class HelloWorld {
    public static void main(String[] args) {
    int i=0,j;
    int count=0;
    while(i < input2){
    for(i=input1; i<=input2; i++){
        for( j=2; j<=i; j++){
            if(i%j==0){
                break;
            }
        }
        if(j==i){
            count++;
        }
    }
    }

return count;
}
}