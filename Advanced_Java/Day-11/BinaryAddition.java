import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st Binary number: ");
        String binaryone = scan.next();
        System.out.print("Enter the 2nd Binary number: ");
        String binarytwo = scan.next();
        
        int decimalone = Integer.parseInt(binaryone, 2);
        int decimaltwo = Integer.parseInt(binarytwo, 2);
        
        int decimalsum = decimalone + decimaltwo;
        
        String binarysum = Integer.toBinaryString(decimalsum);
        
        System.out.println("\nAddition of 2 binary number is "+binarysum);
    }
}
