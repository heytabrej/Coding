#include<stdio.h>

int main(void){
for(int i = 1; i<=3;i++){
    printf("row %d :", i );
    for( int j = 1; j <= 5; j++)
    printf("%3d",j);
    printf("\n");
}
return 0;
}

