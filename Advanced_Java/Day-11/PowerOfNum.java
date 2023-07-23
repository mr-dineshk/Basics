//Java Program to calculate power of a number

import java.util.Scanner;

public class PowerOfNum {

	static double power(int N, int P) {
		return Math.pow(N, P);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the base number: ");
		int b = scan.nextInt();
		System.out.print("Enter the exponent number: ");
		int e = scan.nextInt();
		
		System.out.println("\n"+b+" ^ "+e+" = "+power(b, e));
	}

}
