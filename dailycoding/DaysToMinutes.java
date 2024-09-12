import java.util.Scanner;

public class DaysToMinutes {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input the amount of days to convert to minutes.");
        int days = scan.nextInt();
        System.out.println("There are " + (days * 24 * 60) + " in " + days + " days.");
    }
}
