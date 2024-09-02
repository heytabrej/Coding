#include<stdio.h>

//A year approximately consists of 3.156 × 107 seconds. Write a C program that accepts your
// age in years and convert it into equivalent number of seconds

int main (){
    
    
int age;
float age_in_sec;

  // Enter age (age) in years
printf("How old are you (years)?\t");
scanf("%d",&age);

  // Age in seconds (age_in_sec) = 3.156 × 107*age
age_in_sec=3.156E7*age;

   // Print equivalent age in seconds (age_in_sec)
printf("Your age in seconds is %5.2E",age_in_sec);

return 0;


}