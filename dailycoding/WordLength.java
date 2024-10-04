import java.util.*;

public class WordLength {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input 3 words.");
        String one = scan.next();
        String two = scan.next();
        String three = scan.next();
        System.out.println(one + " has " + (one.length()) + " letters, " + two + " has " + (two.length()) + " letters, " + three + " has " + three.length() + " letters.");
    }
}
