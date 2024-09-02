#include<stdio.h>
#include<math.h>
// Find area of a triangle whose sides are a, b and c
int main()
{

//Read sides a, b and c of triangle
float a, b, c, s, area;

printf("Enter the sides of a triangle\t");
scanf("%f %f %f",&a, &b, &c);

// s = (a+b+c)/2
s=(a+b+c)/2;


// area = sqrt(s*(s−a)*(s−b)*(s−c))
area = sqrt(s * (s - a) * (s - b) * (s - c));


// Print area
printf("Area of triangle is %6.2f sq. units",area);
}