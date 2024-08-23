import java.util.Scanner;

public class FirstMidLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter five values separated by spaces (e.g., 33 12 19 8 52):");
        String input = scanner.nextLine();
        
        String[] values = input.split(" ");
        
        int first = Integer.parseInt(values[0]);
        int middle = Integer.parseInt(values[2]);
        int last = Integer.parseInt(values[4]);
        
        System.out.println("First (" + first + "), Middle (" + middle + "), Last (" + last + ")");
        
        scanner.close();
    }
}
