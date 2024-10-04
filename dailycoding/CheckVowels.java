import java.util.*;

public class CheckVowels {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input a word.");
        String word = scan.nextLine();
        System.out.println("a: " + word.indexOf("a"));
        System.out.println("e: " +word.indexOf("e"));
        System.out.println("i: " +word.indexOf("i"));
        System.out.println("o: " +word.indexOf("o"));
        System.out.println("u: " +word.indexOf("u"));
    }
}
