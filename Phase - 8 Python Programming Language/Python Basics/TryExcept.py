try:
    a = int(input("Enter nnum 1: "))
    b = int(input("Enter nnum 2: "))
    ans = a/b
    print("The ans is: ",ans)
except(ZeroDivisionError):
    print("Can't divide with zero")
except Exception:
    print("Exception occured")
else:
    print("No exception")