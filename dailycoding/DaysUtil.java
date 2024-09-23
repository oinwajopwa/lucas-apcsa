import java.util.Scanner;

public class DaysUtil {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input the amount of days to convert to minutes.");
        int days = scan.nextInt();
        int minutes = (days * 24 * 60);
        System.out.println("There are " + minutes + " minutes in " + days + " days.");
        System.out.println(minutes + " minutes is equal to " + days + " days, " + (minutes % 60) + " hour(s)," + " and " + (minutes % 60) + " minute(s).");
    }
}