
/*
In this program, we first take input for the number of rows and columns of the two matrices, 
and then the elements of the two matrices. 
We then check if the number of columns of the first matrix is equal to the number of rows of the second matrix,
 as that is a necessary condition for matrix multiplication. 
 If the condition is not satisfied, 
 we print a message saying that matrix multiplication is not possible. 
 If the condition is satisfied, 
 we initialize all the elements of the result matrix to 0 and then multiply the two matrices,
  storing the result in the result matrix. Finally, we print the result matrix.
*/

#include <stdio.h>

int main() {
int a[10][10], b[10][10], c[10][10], i, j, k, m, n, p, q;
printf("Enter the number of rows and columns of the first matrix: ");
scanf("%d %d", &m, &n);

printf("Enter the elements of the first matrix: \n");
for (i = 0; i < m; i++) {
    for (j = 0; j < n; j++) {
        scanf("%d", &a[i][j]);
    }
}

printf("Enter the number of rows and columns of the second matrix: ");
scanf("%d %d", &p, &q);

if (n != p) {
    printf("Matrix multiplication is not possible.\n");
} else {
    printf("Enter the elements of the second matrix: \n");
    for (i = 0; i < p; i++) {
        for (j = 0; j < q; j++) {
            scanf("%d", &b[i][j]);
        }
    }

    // Initializing elements of the result matrix to 0
    for (i = 0; i < m; i++) {
        for (j = 0; j < q; j++) {
            c[i][j] = 0;
        }
    }

    // Multiplying the two matrices
    for (i = 0; i < m; i++) {
        for (j = 0; j < q; j++) {
            for (k = 0; k < n; k++) {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    printf("The result matrix is: \n");
    for (i = 0; i < m; i++) {
        for (j = 0; j < q; j++) {
            printf("%d ", c[i][j]);
        }
        printf("\n");
    }
}

return 0;
}