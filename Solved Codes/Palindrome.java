// Write code here
    int sum=0,lastdgt;
    int[] arr={0,0,0,0,0,0,0,0,0,0};
    while(num > 0){
        lastdgt=num%10;
        if(arr[lastdgt]!=0){
            arr[lastdgt]=1;
        }

        num=num/10;
    }







    // int num=input1;
    // while(num > 0){
    //     lastdgt=num%10;
    //     sum=sum*10+lastdgt;
    //     num=num/10;
    // }




if(input1==sum){
    return 2;
}
else{
    return 1;
}
    
}