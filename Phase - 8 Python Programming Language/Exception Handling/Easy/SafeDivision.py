a = float(input())
b = float(input())

try:
    print(a / b)
except ZeroDivisionError:
    print("Error: Division by zero!")