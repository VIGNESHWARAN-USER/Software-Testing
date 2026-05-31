try:
    n = int(input())

    if not (1 <= n <= 100):
        raise ValueError("Enter value between 1 to 100")

    total = 0

    for i in range(1, n + 1):
        total += i * i
        print(total)

except ValueError as e:
    print(e)