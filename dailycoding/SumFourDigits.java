import java.util.Scanner;

class SumFourDigits {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input a 4 digit number.");
        int number = scan.nextInt();
        int sum = ((number) % 10) + ((number/10) % 10)+ ((number/100) % 10) + ((number/1000) % 10);
        System.out.println("The sum of " + number + " is " + sum + ".");
    }
}