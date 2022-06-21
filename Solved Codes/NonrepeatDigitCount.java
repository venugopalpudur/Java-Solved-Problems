class HelloWorld {
    public static void main(String[] args) {
			int count=0;
		int digit,last;
		int cnt[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		while (input1 > 0){
			digit=input1%10;
			if(cnt[digit]==1){
			cnt[digit]=2;
			}
			if(cnt[digit]==0){
				cnt[digit]=1;
			}

			input1=input1/10;
		}
		for(int i=0; i<cnt.length; i++){
			if(cnt[i]==1){
				count++;
			}
		}

		return count;

		//throw new UnsupportedOperationException("nonRepeatDigitsCount(int input1)");
	}
}