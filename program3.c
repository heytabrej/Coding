#include<stdio.h>
// Find the average of three numbers
int main(){
    float avg1,avg2,avg3,average;

    // Read numbers no1, no2, no3

    printf(" enter the three number : \t");
    scanf("%f %f %f", &avg1, &avg2, &avg3);
    

    //Average avg = (no1+no2+no3)/3
    average = (avg1+avg2+avg3)/3;
    

    printf(" the average value of three numbe is : %6.2f\n",average);
    return 0;
}