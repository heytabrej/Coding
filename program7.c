#include<stdio.h>

//An object undergoes uniformly accelerated motion. The initial velocity (u) of the object
// and the acceleration (a) are known. Write a C program to find the velocity (v) of the object after time t

int main(){

    float u,a,t,v;
    //Input the initial velocity (u) and acceleration (a) of the object in SI units

    printf(" Enter the initial velocity (u) and acceleration (a) of the object in SI units : ");
    scanf("%f %f",&u,&a);

    // Input the time (t) after which velocity is to be computed

    printf(" Enter the time (t) after which velocity is to be computed : ");
    scanf("%f",&t);

    //Velocity v = u+a*t

    v = u + a * t;

    // Print value of velocity (v)

    printf(" velocity after %4.2f sec is %4.2f m/s",t,v);

    return 0;
}