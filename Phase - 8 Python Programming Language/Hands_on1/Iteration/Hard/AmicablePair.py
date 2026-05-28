x = int(input())
y = int(input())

sum_x = 0
sum_y = 0

for i in range(1, x):
    if x % i == 0:
        sum_x += i

for i in range(1, y):
    if y % i == 0:
        sum_y += i

if sum_x == y and sum_y == x:
    print("true")
else:
    print("false")