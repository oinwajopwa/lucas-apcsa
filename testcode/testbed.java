
import java.util.Scanner;

class U1_L3_Activity_Two 
{
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) 
  {
    System.out.println("Hi there. What is your name?");
    String name = scan.toString();
    System.out.println("Hi " + name + ". How old are you?");
    int age = scan.nextInt();
    System.out.println(name + " is " + age + " years old.");
  }
}
