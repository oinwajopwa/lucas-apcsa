import java.util.Scanner;

public class FindMiddle {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input a word/number, that has an odd number of letters/numbers.");
        String word = scan.nextLine();
        int length = word.length();
        int middle = length/2;
        System.out.println(word.charAt(middle));
    }
}
