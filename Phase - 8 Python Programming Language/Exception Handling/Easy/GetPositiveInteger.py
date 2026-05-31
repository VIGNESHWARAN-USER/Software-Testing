try:
    num = int(input())

    if num > 0:
        print(num)
    else:
        raise ValueError

except ValueError:
    print("Error: Invalid input! Please enter a positive integer.")