//a program to accept two numbers and print whether their sum is EVEN or ODD
#include <stdio.h>

int main(){
    int m, n, sum;
    printf("Enter the number: ");
    scanf("%d", &m);
    printf("Enter the number: ");
    scanf("%d", &n);
    sum = m + n;
    
    if (sum % 2 == 0){
        printf("%d is EVEN", sum);
    }
    
    else{
        printf("%d is ODD", sum);
    }
    return 0;
}