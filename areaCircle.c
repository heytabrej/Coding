#include<stdio.h>
int main()
{
    float radius,Areacircle;
    // getting the radius of circle from user
    printf("Enter the Radius of Cirlce :");
    scanf("%f",&radius);

    // formula for area of circle
    Areacircle = 3.14*radius*radius;

    // printing the value of circle in area
    printf("The Area OF Circle : %f\n",Areacircle);
    return 0;
}