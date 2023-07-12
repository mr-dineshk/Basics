//a program to accept a number N and print whether it is positive, negative or zero

#include <stdio.h>

int main(){
    int N;
    printf("Enter the number: ");
    scanf("%d", &N);
    
    if (N > 0)
    {
        printf("Positive");
    }
    else if (N < 0)
    {
        printf("Negative");
    }
    else 
    {
        printf("Zero");
    }
}