import java.util.Scanner;
import java.lang.Math;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        EightBall eightBall = new EightBall();
        Scanner scan = new Scanner(System.in);
        String question = "";
        
        HashMap<String, String> keywordResponses = new HashMap<>();
        keywordResponses.put("skrammy", "Skrammy is the best!");
        keywordResponses.put("aaron", "Aaron is awesome!");
        keywordResponses.put("chloe", "Chloe smells like fresh garbage.");
        keywordResponses.put("cesar", "Cesar is a pretty nice person because he's friendly :).");
        keywordResponses.put("poop", "I love poop!");
        keywordResponses.put("no", "Why so negative?");
        // keywordResponses.put(" ", "Please talk to me :(");
        
        while (!question.equalsIgnoreCase("quit")) {
            System.out.println("What's on your mind today?");
            question = scan.nextLine();
            
            if (!question.equalsIgnoreCase("quit")) {
                boolean keywordFound = false;
                
                for (String keyword : keywordResponses.keySet()) {
                    if (question.toLowerCase().contains(keyword)) {
                        System.out.println(keywordResponses.get(keyword));
                        keywordFound = true;
                        break;
                    }
                }
            }
        }
        System.out.println("Thanks for chatting!");
    }
}
