import java.util.*;

public class Halves {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a sentence.");
        String sentence = scan.nextLine();
        System.out.println("Now, grab a word from that sentence.");
        String word = scan.nextLine();
        System.out.println("First Half: " + sentence.substring(0, sentence.indexOf(word)));
        System.out.println("Second Half: " + sentence.substring(sentence.indexOf(word)));
        scan.close();
    }
}

//System.out.println(sentence.indexOf(word));