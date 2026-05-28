num = int(input("Enter the number: "))

if(num < 0):
    print("Invalid number")
else:
    factorial = 1
    for i in range(1, num+1):
        factorial = factorial*i
    print(f"Factorial of the number {num} is: {factorial}")