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

            //  printf("enter the number you want to insert");
            //  scanf("%d",&num);
             printf("enter the position you want to insert");
             scanf("%d",&pos);

        for(int i = pos-1;i <size - 1;i++){
            a[i] = a[i+1];

        }
         size-- ;

    for(int i = 0;i<size;i++){
         printf("%d",a[i]);
    }
}

