// Write a C program print total number of days in a month using switch case.

#include<stdio.h>

int main(){

    int month;
    printf("Enter the Number of days in a month From ( 1 - 12) : ");
    scanf("%d",&month);

    switch(month)
    {

        case 1:
        printf("the Number of days in a january : 31 Days");
        break;
        case 2:
        printf("the Number of days in a February : 28 Days/ 29 days in Leap year");
        break;
        case 3:
        printf("the Number of days in a March : 31 Days");
        break;
        case 4:
        printf("the Number of days in a April : 30 Days");
        break;
        case 5:
        printf("the Number of days in a May : 31 Days");
        break;
        case 6:
        printf("the Number of days in a June : 30 Days");
        break;
        case 7:
        printf("the Number of days in a July : 31 Days");
        break;
        case 8:
        printf("the Number of days in a August : 31 Days");
        break;
        case 9:
        printf("the Number of days in a September : 30 Days");
        break;
        case 10:
        printf("the Number of days in a October : 31 Days");
        break;
        case 11:
        printf("the Number of days in a November : 30 Days");
        break;
        case 12:
        printf("the Number of days in a December : 31 Days");
        break;


        default:
        printf(" Invalid Number !!! Please Put Correct Number From 1 To 12 ");


    }

    return 0;


}