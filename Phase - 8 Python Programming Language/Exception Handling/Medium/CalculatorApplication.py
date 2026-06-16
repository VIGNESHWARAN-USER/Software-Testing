class InputNotANumberException(Exception):
    pass

class DivisionByZeroException(Exception):
    pass

class InvalidMultiplierException(Exception):
    pass

try:
    operation = input("Operation (+,-,*,/): ")

    try:
        num1 = float(input("Operand 1: "))
        num2 = float(input("Operand 2: "))
    except ValueError:
        raise InputNotANumberException(
            "Input must be a number."
        )

    if operation == "+":
        print(f"Output: {num1 + num2}")

    elif operation == "-":
        print(f"Output: {num1 - num2}")

    elif operation == "*":
        if num1 in (0, 1) or num2 in (0, 1):
            raise InvalidMultiplierException(
                "Multiplication operands cannot be 0 or 1."
            )
        print(f"Output: {num1 * num2}")

    elif operation == "/":
        if num2 == 0:
            raise DivisionByZeroException(
                "Division by zero is not allowed."
            )
        print(f"Output: {num1 / num2}")

    else:
        print("Invalid operation")

except InputNotANumberException as e:
    print("Error:", e)

except DivisionByZeroException as e:
    print("Error:", e)

except InvalidMultiplierException as e:
    print("Error:", e)