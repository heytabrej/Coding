#include <stdio.h>
#include <math.h>

int main()
{
    float a, b, c, s, area;

    // Read the sides of the triangle
    printf("Enter the sides of the triangle: ");
    scanf("%f %f %f", &a, &b, &c);

    // Check if the triangle is degenerate
    if (a + b > c && a + c > b && b + c > a)
    {
        // Calculate the semi-perimeter of the triangle
        s = (a + b + c) / 2;

        // Calculate the area of the triangle
        area = sqrt(s * (s - a) * (s - b) * (s - c));

        // Print the area of the triangle
        printf("The area of the triangle is: %f\n", area);
    }
    else
    {
        // Print an error message
        printf("The sides of the triangle do not form a valid triangle\n");
    }

    return 0;
}

