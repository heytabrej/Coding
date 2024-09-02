#include <stdio.h>

int main(void) {
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int array[size];
    printf("Enter the elements of the array, separated by spaces: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &array[i]);
    }

    int min = array[0];
    int max = array[0];

    // Find the minimum and maximum values in the array
    for (int i = 1; i < size; i++) {
        if (array[i] < min) {
            min = array[i];
        }
        if (array[i] > max) {
            max = array[i];
        }
    }

    printf("Minimum value: %d\n", min);
    printf("Maximum value: %d\n", max);

    
    
    return 0;
}
