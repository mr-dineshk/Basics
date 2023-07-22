//Simple interest 
// simple interest = (p*n*t) / 100

import java.util.Scanner;

class SimpleInterest {
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Enter the principle: ");
	  double p = scan.nextInt();
	  System.out.print("Enter the rate: ");
	  double r = scan.nextInt();
	  System.out.print("Enter the time: ");
	  double t = scan.nextInt();
	  
	  double sm = (p * t * r) / 100;
	  
	  System.out.println("\n********************************************");
	  System.out.println("Principle:\t"+p);
	  System.out.println("Rate:\t\t"+r);
	  System.out.println("Time:\t\t"+t);
	  System.out.println("\nSimple interest: "+sm);
	  System.out.println("********************************************");
  }
}
