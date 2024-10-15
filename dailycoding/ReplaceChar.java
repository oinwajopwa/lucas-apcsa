import java.util.*;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word, position, and letter");

        String word = scan.next();
        int pos = scan.nextInt();
        String letter = scan.next();

        String wordMod = word.substring(0,pos-1) + letter + word.substring(pos);
        

        System.out.println(wordMod);
        scan.close();
    }
}
