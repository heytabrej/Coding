#include<stdio.h>

int main()
{
    int a, b, sum;

    // Read two numbers from the user
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);

    // Calculate the sum of the two numbers
    sum = a + b;

    // Print the result
    printf("The sum is: %d\n", sum);

    return 0;
}

