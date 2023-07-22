//Array Reverse
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter the no. of array: ");
       int n = scan.nextInt();
       
       int[] a = new int[n];
       System.out.println("Enter the array Elements: ");
       for (int i = 0; i < n; i++) {
    	   a[i] = scan.nextInt();
       }
       //Reverse array
      
       int start = 0;
       int end = n - 1;
       while (start < end){
	       int temp = a[start];
	       a[start] = a[end];
	       a[end]= temp;
	       start++;
	       end--;
       }
       System.out.println("Reverse array:  ");
       for (int num : a) {
    	   System.out.println(num+" ");
       }
    }
}
