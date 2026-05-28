minimum = 100
maximum = 0

total = 0
count = 0

while True:
    price = int(input())

    if price == -1:
        break

    if price < minimum:
        minimum = price

    if price > maximum:
        maximum = price

    if 5 <= price <= 30:
        total += price
        count += 1

average = total // count

print(maximum, minimum, average)