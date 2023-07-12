//a program to accept a number N and print whether the number is EVEN or ODD
#include <stdio.h>

int main(){
    int N;
    printf("Enter the number: ");
    scanf("%d", &N);
   
    
    if (N % 2 == 0){
        printf("EVEN");
    }
    
    else{
        printf("ODD");
    }
    return 0;
}