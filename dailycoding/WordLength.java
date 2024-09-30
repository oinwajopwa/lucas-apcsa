import java.util.*;

public class WordLength {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input 3 words.");
        String one = scan.next();
        String two = scan.next();
        String three = scan.next();
        int length1 = one.length();
        int length2 = two.length();
        int length3 = three.length();
        System.out.println(one + " has " + length1 + " letters, " + two + " has " + length2 + " letters, " + three + " has " + length3 + " letters.");
    }
}
