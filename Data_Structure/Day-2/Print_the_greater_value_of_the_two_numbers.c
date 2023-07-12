//a program to accept two numbers and print the greater value of the two
#include <stdio.h>

int main(){
    int m, n;
    printf("Enter the number: ");
    scanf("%d", &m);
    printf("Enter the number: ");
    scanf("%d", &n);
    
    if (m < n){
        printf("Greater value is %d",n);
    }
    else if (m > n){
        printf("Greater value is %d",m);
    }
    else{
        printf("Two values are Same");
    }
    return 0;
}