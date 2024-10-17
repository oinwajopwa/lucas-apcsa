import java.util.Scanner;

public class BeforeAndAfter {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please select a number.");
        int value = scan.nextInt();
        System.out.println("Please select a letter.");
        char letter = scan.next().charAt(0);
        char before1 = (char) (letter - 2);
        char before2 = (char) (letter - 1);
        char before3 = (char) (letter + 1);
        char before4 = (char) (letter + 2);

        int valueb1 = value - 1;
        int valueb2 = value - 2;
        int valuea1 = value + 1;
        int valuea2 = value + 2;
        System.out.println(valueb2 + " " + valueb1 + " " + value + " " + valuea1 + " " + valuea2);
        System.out.println(before1 + " " + before2 + " " + letter + " " + before3 + " " + before4);
    }
}
