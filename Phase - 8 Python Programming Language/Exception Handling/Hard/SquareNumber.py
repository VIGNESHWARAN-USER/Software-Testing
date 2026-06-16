try:
    num = int(input("Enter a number: "))
    print(f"The square of {num} is {num * num}")

except ValueError:
    print("Error: Invalid input. Please enter a valid number.")

finally:
    print("Execution complete")