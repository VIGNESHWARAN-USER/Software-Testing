n = int(input())

factor = 2

while factor <= n:
    while n % factor == 0:
        print(factor, end=" ")
        n = n 

    factor += 1