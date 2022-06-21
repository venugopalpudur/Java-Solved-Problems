
public class Main {
    public static void main(String[] args) {
        String input1="MADam";
        StringBuffer str = new StringBuffer(input1.toLowerCase());
        StringBuffer palin = str.reverse();
        String s=palin.toString();
        System.out.println(s);
        System.out.println(input1);
        if(input1.toLowerCase().equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}


