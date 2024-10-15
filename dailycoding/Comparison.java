import java.util.*;

public class Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input four words. (ex. Apple Banana Pear Orange)");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        String word4 = scan.next();
        
        System.out.println(word1 + " to " + word2 + ": " + word1.compareTo(word2));
        System.out.println(word1 + " to " + word3 + ": " + word1.compareTo(word3));
        System.out.println(word1 + " to " + word4 + ": " + word1.compareTo(word4));
        scan.close();
    }
}
