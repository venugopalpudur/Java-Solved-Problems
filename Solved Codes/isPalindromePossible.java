    int sum=0,lastdgt;
	int length=0;
	int count=1;
    int[] arr1={0,0,0,0,0,0,0,0,0,0};
	//int[] arr2={0,0,0,0,0,0,0,0,0,0};
    while(num > 0){
        lastdgt=num%10;
        if(arr1[lastdgt]==0){
            arr1[lastdgt]=1;
        }
		if(arr1[lastdgt]!=0){
			arr1[lastdgt]=arr1[lastdgt]+1;
		}
        num=num/10;
    }

	for(int i=0; i<10; i++){
		if(arr1[i]!=0){
			length++;
		}
	}
