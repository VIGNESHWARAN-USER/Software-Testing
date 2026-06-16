currentNumber = int(input("Enter number: "))

if currentNumber % 2 != 0:
    currentNumber = 3 * currentNumber + 1
else:
    currentNumber = currentNumber // 2

print(currentNumber)