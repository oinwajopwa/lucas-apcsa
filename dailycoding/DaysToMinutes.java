import java.util.Scanner;

public class DaysToMinutes {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input the amount of days to convert to minutes.");
        int days = scan.nextInt();
        int minutes = days * 1440;
        System.out.println("There are " + minutes + " in " + days + " days.");
    }
}
