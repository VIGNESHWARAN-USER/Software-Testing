try:
    n = int(input())

    if n <= 0:
        raise Exception("Enter only positive numbers")

    total = 0

    for i in range(1, n + 1):
        total += 1 / (i ** i)

    print(round(total, 5))

except ValueError:
    print("Exception: Enter only positive numbers")

except Exception as e:
    print("Exception:", e)