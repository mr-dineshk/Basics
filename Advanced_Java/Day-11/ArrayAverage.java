//Java Program to Calculate average of numbers using Array
public class ArrayAverage {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		int length = arr.length; // 7
		
		int sum = 0;
		
		for(int i = 0; i<length; i++) 
		{
			sum+=arr[i]; // 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
		}
		double average = sum/length; // 28 / 7
		System.out.println("Array average = "+average); // 4.0
	}

}
