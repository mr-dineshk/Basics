import java.util.Scanner;
public class LargestElementArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of Array: ");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the elements of array: ");
		for (int i = 0; i<n; i++)
		{
		    a[i] = scan.nextInt();    
		}
		int max = a[0];
		for (int i = 0; i<a.length; i++) 
		{
			if (a[i]>max) 
			{
				max = a[i];
			}
			
		}
		System.out.println("Maximum element is "+max);

	}

}
