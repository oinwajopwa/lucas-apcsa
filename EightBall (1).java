public class EightBall {
        public static String MagicEightBall() {
        String[] answers = {
            "\"It is certain.\"",
            "\"Most Likely.\"",
            "\"Ask Again Later.\"",
            "\"Outlook is not good.\"",
            "\"Yes.\"",
            "\"No.\""
        };
        
        int ranNum = (int) (Math.random() * answers.length);
        return answers[ranNum];
    }   
}