import java.util.Scanner;
public class LargestElementArray {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of Array: ");
		int a[] = {12,13,99,12,34};
		int max = a[0];
		for (int i = 0; i<a.length; i++) 
		{
			if (a[i]>max) 
			{
				max = a[i];
			}
			
		}
		System.out.println(max+" ");

	}

}
