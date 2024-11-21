import java.util.Scanner;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args) {
        EightBall fortune1 = new EightBall();
        EightBall fortune2 = new EightBall();
        fortune1.MagicEightBall();
        fortune2.MagicEightBall();
        
        Scanner scan = new Scanner(System.in);
        String question = "";
        
        for (int i = 0; i < 25; i++ ) {
        //while (!question.equals("quit")) {
            System.out.println("Ask a question (or type 'quit' to exit):");
            question = scan.nextLine();
            
            if (!question.equals("quit")) {
                System.out.println("Skrammy the Magic 8-Ball says: " + fortune1.MagicEightBall());
                System.out.println("Skrammy the Magic 8-Ball the Second says: " + fortune2.MagicEightBall());
            }
        }

        System.out.println("Thanks for playing!");
        scan.close();
    }
}