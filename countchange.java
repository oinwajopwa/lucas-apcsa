import java.util.Scanner;

class kaisov
{
  public static void main(String[] args) 
  {

    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int pennies;
    int nickels;
    int dimes;
    int quarters;
    

    System.out.println("Hi, my name is Kai Sov, can you please name the amount pennies you have today.");
    pennies = scan.nextInt();
    System.out.println("Can you please name the amount nickels you have today.");
    nickels = scan.nextInt();
    System.out.println("Can you please name the amount dimes you have today.");
    dimes = scan.nextInt();
    System.out.println("Can you please name the amount quarters you have today.");
    quarters = scan.nextInt();
    double total = (pennies * 0.01) + (nickels*0.05) + (dimes*0.10) + (quarters*0.25);
    System.out.println("The total of " + pennies + " pennies, " + nickels + " nickels, " + dimes + " dimes, " + quarters + " quarters, is $" + total + ".");
}
}
