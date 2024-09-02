#include <stdio.h>

int main(){
    int a[50],size,i, num,pos;

    printf("enter the size of the array ");
    scanf("%d",&size);
//    if ( a[50] >= size ){
//     printf(" invalid size  operation ");
//    }else {
    printf("enter the element of the arraay");
    for(i=0;i<size;i++){
        scanf("%d",&a[i]);

    }

             printf("enter the number you want to insert");
             scanf("%d",&num);
             printf("enter the position you want to insert");
             scanf("%d",&pos);

    
    for(int i = size-1; i>=pos - 1;i--){
      a[i+1] = a[i];
      
    }
      a[pos-1] = num;
      size++;
    
    printf("element of array ");
    for(int i = 0;i<size;i++){
        printf("%d", a[i]);
    }
 }