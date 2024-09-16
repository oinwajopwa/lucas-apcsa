import java.util.Scanner;

public class PrimitiveTypeTrivia {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What's your favorite number between 1-127?");
        byte q1 = scan.nextByte();
        System.out.println("What's your favorite number past/before 127?");
        long q2 = scan.nextLong();
        System.out.println("What's your favorite number between " + q2 + "-32767?");
        short q3 = scan.nextShort();
        System.out.println("What's your favorite number?");
        int q4 = scan.nextInt();
        System.out.println("What's 5/3? (Put in decimal form)");
        float q5 = scan.nextFloat();
        System.out.println("Is the sky blue? True or False.");
        boolean q6 = scan.nextBoolean();
        System.out.println("What's your grade in CSA?");
        char q7 = scan.next().charAt(0);
        System.out.println("You provided the following answers: " + q1 + ", " + q2 + ", " + q3 + ", " + q4 + ", " + q5 + ", " + q6 + ", and " + q7 + ".");
    
    }
}
