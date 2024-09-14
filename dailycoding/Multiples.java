import java.util.Scanner;

class Multiples {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Please pick 5 values you want to multiply.");
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        int value3 = scan.nextInt();
        int value4 = scan.nextInt();
        int value5 = scan.nextInt();
        System.out.println("Now, pick the number you want to multiply them by.");
        int multiplier = scan.nextInt();
        int value11 = value1 * multiplier;
        int value22 = value2 * multiplier;
        int value33 = value3 * multiplier;
        int value44 = value4 * multiplier;
        int value55 = value5 * multiplier;
        System.out.println(value11 + " " + value22 + " " + value33 + " " + value44 + " " + value55);
    }
}
//SUPER INEFFICIENT!!!!!!!!!!!!!!!!!! I'll find a more efficient solution later.