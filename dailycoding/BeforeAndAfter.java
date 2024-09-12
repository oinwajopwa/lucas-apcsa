import java.util.Scanner;

public class BeforeAndAfter {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please select a number.");
        int value = scan.nextInt();
        int valueb1 = value - 1;
        int valueb2 = value - 2;
        int valuea1 = value + 1;
        int valuea2 = value + 2;
        System.out.println(valueb2 + " " + valueb1 + " " + value + " " + valuea1 + " " + valuea2);
    }
}
