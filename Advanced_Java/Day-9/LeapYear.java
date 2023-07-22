//to find a LeapYear 
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        boolean isleapyear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        System.out.println(year+" is "+(isleapyear ?"" :"not ")+"leap year.");
        
    }
}
