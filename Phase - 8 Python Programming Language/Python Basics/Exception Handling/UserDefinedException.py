class Error(Exception):
    pass

class ValueTooSmall(Error):
    pass

class ValueTooLarge(Error):
    pass

try:
    n = int(input("Enter a number: "))
    if(n <= 0):
        raise ValueTooSmall("The given value is too small")
    elif(n >= 10000):
        raise ValueTooLarge("The given value is too large")
    else:
        print("The given value is in valid range")
except ValueTooLarge as e:
    print(e)
except ValueTooSmall as e:
    print(e)
else:
    print("No exception occured.")
finally:
    print("Code executed successfully.")