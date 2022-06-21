class HelloWorld {
    public static void main(String[] args) {
       int num=27;
       int div=0;
       for(int i=num-1; i>1; i--){
           if(num%i==0){
               div=i;
           }
       }
       System.out.println(div);
    }
}