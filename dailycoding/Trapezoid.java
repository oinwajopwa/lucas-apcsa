import java.util.Scanner;

class Trapezoid{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("Welcome to the Trapezoid Area Finder, please input the large base.");
      int LB = scan.nextInt();
      System.out.println("Now, input the small base.");
      int SB = scan.nextInt();
      int LSB = (LB + SB)/2;
      System.out.println("Lastly, input the height.");
      int height = scan.nextInt();
      int Area = LSB * height;
      System.out.println("The area of the triangle is " + Area + ".");
    }
  }
