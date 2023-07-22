//Find the Quotient and remainder

import java.util.Scanner;
public class QuoRem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int m = scan.nextInt();
		System.out.print("Enter the 2nd number: ");
		int n = scan.nextInt();
		
		int quotient = m / n;
		int remainder = m % n;
		
		System.out.println("\nQuotient is "+quotient+"\nRemainder is "+remainder);
		

	}

}
