public class NameInASCII {
    public static void main(String[] args){
        String name = "lucas";
        int l = (int) name.charAt(0);
        int u = (int) name.charAt(1);
        int c = (int) name.charAt(2);
        int a = (int) name.charAt(3);
        int s = (int) name.charAt(4);
        System.out.println("lucas is " + l + " " + u + " " + c + " " + a + " " + s);
    }
}