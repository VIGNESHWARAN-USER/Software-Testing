def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def callback(operation, operand1, operand2):
    return operation(operand1, operand2)


num1 = 10
num2 = 5

print("Addition:", callback(add, num1, num2))
print("Subtraction:", callback(subtract, num1, num2))
print("Multiplication:", callback(multiply, num1, num2))

