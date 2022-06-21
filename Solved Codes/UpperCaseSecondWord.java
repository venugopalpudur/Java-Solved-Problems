
public class Main {

    public static void main(String[] args) {
        String m="madam";
        String upper="";
        String[] word=m.split(" ");
        if(word.length > 1){
            upper = word[1].toUpperCase();
            System.out.println(upper);
        }
        else{
            System.out.println("LESS");
        }
    }
}

