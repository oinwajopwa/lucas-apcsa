import java.util.Scanner;

public class DaysUtil {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input the amount of days to convert to minutes.");
        int days = scan.nextInt();
        int minutes = days * 24 * 60;
        System.out.println("Input the amount of minutes to convert to days, hours, and minutes");
        int inputtedMinutes = scan.nextInt();
        int minutes1 = inputtedMinutes % 60;
        int hours = (inputtedMinutes / 60) % 60;
        System.out.println("There are " + minutes + " minutes in " + days + " days.");
        System.out.println(inputtedMinutes + " minutes is equal to " + days + " days, " + hours + " hour(s)," + " and " + minutes1 + " minute(s).");
    }
}