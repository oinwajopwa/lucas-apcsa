import java.util.Scanner;

public class Nibble {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Please input a nibble. (4 bit-sequence)");
        String nibble = scan.nextLine();
        char d1 = nibble.charAt(0);
        char d2 = nibble.charAt(1);
        char d3 = nibble.charAt(2);
        char d4 = nibble.charAt(3);

        int i1 = d1 - '0';
        int i2 = d2 - '0';
        int i3 = d3 - '0';
        int i4 = d4 - '0';
        int total = (i1 * 8) + (i2 * 4) + (i3 * 2) + (i4 * 1);

        System.out.println("The binary sequence of " + nibble + " is " + total);
    }
}
