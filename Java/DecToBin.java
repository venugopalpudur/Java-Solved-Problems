class HelloWorld {
    public static void main(String[] args) {
       String bin="";
       int dec=31;
       int quo=0;
       while(dec>0){
           System.out.print(dec%2);
           //bin=bin+Integer.toString(dec%2);
            dec=dec/2;
       }
       System.out.println(bin);
    }
}