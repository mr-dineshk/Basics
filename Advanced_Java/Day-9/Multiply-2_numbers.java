// multiply 2 numbers
import java.util.Scanner;
public class Multiply2n {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int f = scan.nextInt();
		System.out.print("Enter the 2nd number: ");
		int s = scan.nextInt();
		
		int m = f*s;
		System.out.println("\nMultiply of "+f+" x "+s+" is "+m);

	}
}
