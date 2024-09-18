import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Enter a number between 1 and 10: ");
        number = scan.nextInt();

        System.out.println(number * 1);
        System.out.println(number * 2);
        System.out.println(number * 3);
        System.out.println(number * 4);
        System.out.println(number * 5);
        scan.close();
    }
}
