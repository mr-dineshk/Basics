//Pyramid Triangle
public class PyramidTriange {

	public static void main(String[] args) {
		int row = 5, i, j, k;
		for(i = 1; i<=row; i++) 
		{
			for(j = 1; j<= row-i; j++) 
			{
				System.out.print(" ");
			}
			for(k = 1; k <= 2*i-1; k++)
			{
				System.out.print("*");
				
			}
			System.out.print("\n");
		}

	}

