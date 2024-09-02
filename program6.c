#include<stdio.h>

//The velocity of an object is given in km/hr. Write a C program to convert the given velocity from km/hr to m/sec

int main(){

    // Input the velocity (velk) given in km/hr
    float vk,vm;
    printf(" enter the velocity in km/her : ");
    scanf("%f",&vk);

    // velocity in m/sec (velm) = velk*5/18

    vm = vk*5/18;

     // Print velocity in m/sec (velm)
    printf(" the velocity in m/sec : %f",vm);

    return 0;

}