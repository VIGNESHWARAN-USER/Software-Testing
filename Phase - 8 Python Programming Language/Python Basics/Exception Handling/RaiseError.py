import traceback


try:
    num = int(input("Enter the number: "))
    if(num <= 0):
        raise ValueError("The number should be positive.")
    else:
        print("It is a positive number")
except ValueError as e:
    print(e)
    traceback.print_exc()
