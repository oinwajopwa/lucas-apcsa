public class NameInASCIIvtwo {
    public static void main(String[] args){
        String name = "lucas";
        int l = (int) name.charAt(0);
        int u = (int) name.charAt(1);
        int c = (int) name.charAt(2);
        int a = (int) name.charAt(3);
        int s = (int) name.charAt(4);

        char L = (char)  (name.charAt(0) - 32);
        char U = (char) (name.charAt(1) - 32);
        char C = (char) (name.charAt(2) - 32);
        char A = (char) (name.charAt(3) - 32);
        char S = (char) (name.charAt(4) - 32);

        System.out.println("lucas is " + l + " " + u + " " + c + " " + a + " " + s);
        System.out.println("lucas uppercased is " + L + " " + U + " " + C + " " + A + " " + S);
    }
}