//Floyd Triangle

import java.util.Scanner;
public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int i, j, num, row;
		System.out.println("Enter the Starting number: ");
		num = scan.nextInt();
		System.out.println("Enter the rows: ");
		row = scan.nextInt();
		
		for (i = 0; i < row; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print(num+" ");
				num++;
			}System.out.println();
		}

	}

}
