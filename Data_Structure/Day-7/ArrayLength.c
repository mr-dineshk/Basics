//Number of elements in array
#include <stdio.h>  
   
int main()  
{   
    int arr[] = {2, 2, 3, 4, 5};       
   
    int length = sizeof(arr)/sizeof(arr[0]);  
      
    printf("Number of elements present in given array: %d", length);   
   
    return 0;  
}  
