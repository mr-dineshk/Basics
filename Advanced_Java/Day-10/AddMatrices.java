// Addition of two matrix
import java.util.Scanner;

public class AddMatrices 
{
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter the Rows: ");
    	int row = scan.nextInt();
    	System.out.print("Enter the Columns: ");
    	int column = scan.nextInt();
    	
    	int[][] m1 = new int [row][column]; //matrix 1
    	int[][] m2 = new int [row][column]; //matrix 2
    	int[][] sm = new int [row][column]; //sum of the 2 matrix
    	
    	System.out.println("\nEnter the first matrix: ");
    	for (int i = 0; i<row; i++) {
    		for (int j = 0; j<column; j++) {
    			m1[i][j] = scan.nextInt();
    		}
    	}
    	System.out.println("Enter the second matrix: ");
    	for (int i = 0; i<row; i++) {
    		for (int j = 0; j<column; j++) {
    			m2[i][j] = scan.nextInt();
    		}
    	}
    	for (int i = 0; i<row; i++) {
    		for (int j = 0; j<column; j++) {
    			sm[i][j] = m1[i][j] + m2[i][j];
    		}
    	}
    	System.out.println("\n"+row+" X "+column+" Matrix");
    	for (int i = 0; i<row; i++) {
    		for (int j = 0; j<column; j++) {
    			System.out.print(sm[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
    	
    }
}
