import java.util.Scanner;

public class NibbleRefactor {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Please input a nibble. (4 bit-sequence)");
        String nibble = scan.nextLine();
        
        System.out.println("The binary sequence of " + nibble + " is " + (((nibble.charAt(0) - '0') * 8) +  ((nibble.charAt(1) - '0') * 4) +  ((nibble.charAt(2) - '0') * 2) + ((nibble.charAt(3) - '0') * 1)));

    }
}
