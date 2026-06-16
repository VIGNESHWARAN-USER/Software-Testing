num = int(input())

digits = str(num)
power = len(digits)

total = 0

for digit in digits:
    total += int(digit) ** power

if total == num:
    print("true")
else:
    print("false")