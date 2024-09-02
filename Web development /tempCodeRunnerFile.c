#include <stdio.h>

float f(float x) {
  return x*x*x - x*x - 2;
}

float df(float x) {
  return 3*x*x - 2*x;
}

int main() {
  float a;
  int n, k;

  printf("Initial guess=");
  scanf("%f", &a);

  printf("Number of iterations: ");
  scanf("%d", &n);

  k = 1;
  while (k <= n) {
    float r = a - f(a) / df(a);
    printf("Root=%.6f at Iteration %d\n", r, k);
    k = k + 1;
    a = r;
  }

  return 0;
}
