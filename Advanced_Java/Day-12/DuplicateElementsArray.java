//Find the Duplicate elements of an array
import java.util.Scanner;

public class DuplicateElementsArray 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of array elements: ");
		int n = scan.nextInt();
		
		System.out.println("Enter the array elements: ");
		int b[] = new int [n];
		
		for (int i = 0; i<n; i++) 
		{
			b[i] = scan.nextInt();
		}
		
		System.out.println("Duplicate array elements: ");
		for (int i = 0; i<n; i++) 
		{
			for(int j = i+1; j<n; j++) 
			{
				if (b[i] == b[j]) 
				{
					System.out.print(b[j]+" ");
				}
				
			}
		}
	}
}
