import math

# Function to evaluate the first-order equation
def f(x, y):
    return x ** 3 + y

# Function to solve a first-order equation using the Runge-Kutta method of fourth order
def rk4(x0, y0, h, n):
    # Initialize x and y
    x = x0
    y = y0

    # Solve the equation using the Runge-Kutta method
    for i in range(n):
        k1 = h * f(x, y)
        k2 = h * f(x + h / 2, y + k1 / 2)
        k3 = h * f(x + h / 2, y + k2 / 2)
        k4 = h * f(x + h, y + k3)

        x += h
        y += (k1 + 2 * k2 + 2 * k3 + k4) / 6

        print(f"x = {x}, y = {y}")

# Solve the equation dy/dx = x^3 + y with initial condition y(0) = 2
rk4(0, 2, 0.1, 10)
