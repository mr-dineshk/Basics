// Adding odd numbers the list 
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of elements: ");
		int n = scan.nextInt();
		int []a = new int [n];
		int sum = 0;
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n; i++)
		{
		    a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
		    if (a[i] % 2 != 0)
		    {
		        sum += a[i];
		    }
		}
		
		System.out.println("\n"+sum);
	}
}
