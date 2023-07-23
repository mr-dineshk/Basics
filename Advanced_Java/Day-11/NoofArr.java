//Program to find number of elements in an array
import java.util.Scanner;
public class NoofArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("Enter the Number of array: ");
		int n = scan.nextInt();
		System.out.print("Enter the "+n+" array elements: ");
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) 
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Total number of elements of array is "+ arr.length);
	}

}
