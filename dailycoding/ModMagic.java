import java.util.Scanner;
public class ModMagic {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Please input a value greater than 10.");
        int value = scan.nextInt();
        System.out.printf("%d %d %d %d %d %d %d %d\n", value % 2, value % 3, value % 4, value % 5, value % 6, value % 7, value % 8, value % 9);
    }
}
