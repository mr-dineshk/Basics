//a program to accept two numbers and print whether their sum is EVEN or ODD

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int N, O, ans;
        System.out.println("Enter the Number: ");
        N = scan.nextInt();
        System.out.println("Enter the Number: ");
        O = scan.nextInt();
        ans = N + O;
        System.out.println("\n"+N+" + "+O+" = "+ans);
        if (ans % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
