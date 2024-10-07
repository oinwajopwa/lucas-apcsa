import java.util.*;

public class PartsOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a four letter word.");
        String word = scan.nextLine();
        System.out.println(word.substring(0,1) + " " + word.substring(0,2) + " " + word.substring(0,3) + " " + word.substring(0, 4) + " " + word.substring(1, 4) + " " + word.substring(2, 4) + " " + word.substring(3, 4) + " " + word.substring(1, 3));
        scan.close();
    }
}