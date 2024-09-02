#include<stdio.h>
//Convert the temperature given in Fahrenheit to Celsius
int main(){
    float f,c;

//Read the temperature given in Fahrenheit (f)
printf("Enter the temperature in Fahrenheit : \t");
scanf("%f",&f);

//Temperature in Celsius (c) = 5/9*(f−32)
c = 5.0/9.0*(f-32);

//Print temperature in Celsius
printf("temperature in calsius is : %6.3f\n",c);
return 0;
}