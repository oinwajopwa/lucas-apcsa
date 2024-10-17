import java.util.*;

public class AllEqual {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input 3 words.");
        String w1 = scan.next();
        String w2 = scan.next();
        String w3 = scan.next();
        
        boolean AllEqual = w1.charAt(w1.length()-1) == w2.charAt(w2.length()-1) && w2.charAt(w2.length()-1) == w3.charAt(w3.length()-1);
        System.out.println(AllEqual);
        scan.close();
    }
}