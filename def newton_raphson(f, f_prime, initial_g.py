def newton_raphson(f, f_prime, initial_guess, tolerance=1e-6, max_iterations=100):
    x = initial_guess
    for i in range(max_iterations):
        f_val = f(x)
        f_prime_val = f_prime(x)
        
        if abs(f_val) < tolerance:
            return x
        
        x -= f_val / f_prime_val
        
    return None  # Return None if the method did not converge within the maximum number of iterations


# Example usage:

# Define the function and its derivative
def f(x):
    return x ** 2 - 4

def f_prime(x):
    return 2 * x

# Initial guess
initial_guess = 1.5

# Call the Newton-Raphson method
root = newton_raphson(f, f_prime, initial_guess)

if root is not None:
    print(f"Root found: {root}")
else:
    print("Root not found within the maximum number of iterations.")
