a = "tabrejalam"

# Initialize an empty string to store the modified result
result = ""

# Loop through each character in the string
for i in range(len(a)):
    # If the index is even, capitalize the character and add it to the result
    if i % 2 == 0:
        result += a[i].upper()
    # If the index is odd, add the character as it is to the result
    else:
        result += a[i]

# Print the modified result
print(result)
