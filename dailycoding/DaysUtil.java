import java.util.Scanner;

public class DaysUtil {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input the amount of days to convert to minutes.");
        int days = scan.nextInt();
        int minutes = 36059;
        int minutes1 = minutes % 60;
        int hours = (minutes / 60) % 60;
        System.out.println("There are " + minutes + " minutes in " + days + " days.");
        System.out.println(minutes + " minutes is equal to " + days + " days, " + hours + " hour(s)," + " and " + minutes1 + " minute(s).");
    }
}