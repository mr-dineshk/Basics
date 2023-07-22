// calculate the compound intrest in java

import java.util.Scanner;
public class CompoundInterest 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        double p = scanner.nextDouble();
        System.out.println("Enter the Rate: ");
        double r = scanner.nextDouble();
        System.out.println("Enter the time: ");
        double t = scanner.nextDouble();
      
        double cm = (p * Math.pow(1 + r/100, t)-p);
        System.out.println("Compound interest - "+cm);
    }
}
