num = input()

if len(num) == 5 and num.isdigit():
    print(num[::-1])
else:
    print("Not a valid number")