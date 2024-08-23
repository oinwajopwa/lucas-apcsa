import java.util.Scanner;

class aaronamaya
{
  
  public static void main(String[] args) 
  {
    
    Scanner scan = new Scanner(System.in);
    
    String classes;
    int numClasses;
    
    System.out.println("Hi, I'm Aaron Amaya, how many AP classes are you taking?");
    numClasses = scan.nextInt();
    scan.nextLine();
    System.out.println("Can you name the AP classes you're taking?");
    classes = scan.nextLine();
    System.out.println("You are taking the following " + numClasses + " AP classes and they are " + classes + ".");
  } //scan.close();
}