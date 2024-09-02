#include <stdio.h>

int main(){
    int a[50],size,i;

    printf("enter the size of the array ");
    scanf("%d",&size);

    printf("enter the element of the arraay");
    for(i=0;i<size;i++){
        scanf("%d",&a[i]);

    }

    printf("element of array ");
    for(int i = 0; i<size;i++){
     printf(" ");
    printf("%d",a[i]);
    }
    return 0;
    
    }

