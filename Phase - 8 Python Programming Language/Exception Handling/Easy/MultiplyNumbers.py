a = eval(input())
b = eval(input())

try:
    if not (isinstance(a, (int, float)) and isinstance(b, (int, float))):
        raise TypeError

    print(a * b)

except TypeError:
    print("Error: Invalid operand type!")