// copy array elements
import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of array elements: ");
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Array elements: ");
        for (int i = 0; i < n; i++) {
        	arr1[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
        	arr2[i] = arr1[i];
        }
        
        System.out.println("Copied array elements are: ");
        for (int num : arr2) {
        	System.out.print(num+" ");
        }
    }  
}
