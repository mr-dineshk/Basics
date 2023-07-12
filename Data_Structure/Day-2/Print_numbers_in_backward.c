//a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0
#include <stdio.h>

int main(){
    int i = 100;
    while(i>=0){
        printf("%d\n", i);
        i--;
    }
}