import java.util.Scanner;

class Average
{
  public static void main(String[] args) 
  {
    @SuppressWarnings("resource") //scan never closes warning kept appearing so i put this here cause it was annoying
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input your 3 values separated by a space, to calculate the average.");
    int value1 = scan.nextInt();
    int value2 = scan.nextInt();
    int value3 = scan.nextInt();
    double average = (value1 + value2 + value3)/3f;
    System.out.printf("%.2f", average);
  }
}