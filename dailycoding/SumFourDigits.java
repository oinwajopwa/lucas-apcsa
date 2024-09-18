import java.util.Scanner;

class SumFourDigits {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input a 4 digit number.");
        int number = scan.nextInt();
        int val1 = (number) % 10;
        int val2 = (number/10) % 10;
        int val3 = (number/100) % 10;
        int val4 = (number/1000) % 10;
        int sum = val1 + val2 + val3 + val4;
        System.out.println("The sum of " + number + " is " + sum + ".");
    }
}