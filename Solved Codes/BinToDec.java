class HelloWorld {
    public static void main(String[] args) {
       long bin=01101; // keep in mind that remove starting zero and see.
       long rem=0;
       int count=0;
       int dec=0;
       System.out.println("-----bin----- "+bin);
       while(bin>0){
           rem=bin%10;
           bin=bin/10;
           dec += rem*Math.pow(2,count);
           System.out.println("bin "+bin);
           System.out.println("rem "+rem);
           System.out.println("power "+Math.pow(2,count));
           //System.out.println(dec);
           count++;
       }
       System.out.println(dec);
    }
}