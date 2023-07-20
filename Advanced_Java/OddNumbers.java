//a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        int i;
        for(i = 1; i < 100; i+=2){
            System.out.println(i);
        }
    }
}
