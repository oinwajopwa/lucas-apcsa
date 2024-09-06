import java.util.Scanner;

public class birthday {
    static Scanner scan = new Scanner(System.in);
      public static void main(String[] args) 
  {
    System.out.println("What year were you born?");
    int year = scan.nextInt();
    System.out.println("What month were you born?");
    int month = scan.nextInt();
    System.out.println("What day were you born?");
    int day = scan.nextInt();
    System.out.println("You were born in month " + month + " on day " + day + " in year " + year + ".");
  } 
}
