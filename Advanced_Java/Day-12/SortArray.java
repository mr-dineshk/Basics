//Sorting the array elemnt (Bubble sort)
import java.util.Scanner;
public class SortArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no of array elements: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the "+n+" array elements: ");
		for (int i = 0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i<n; i++) {
			for (int j = i + 1; j<n; j++) {
				if (a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted array: ");
		for(int i = 0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
