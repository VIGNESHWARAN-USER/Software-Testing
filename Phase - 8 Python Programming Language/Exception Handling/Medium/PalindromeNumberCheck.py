try:
    n = input()

    if '.' in n:
        print("Enter only integer numbers")
    else:
        num = int(n)

        if str(num) == str(num)[::-1]:
            print("Palindrome")
        else:
            print("Not Palindrome")

except ValueError:
    print("Enter only integer numbers")