def sumOddEven(lb, ub):
    oddSum, evenSum = 0, 0

    for i in range(lb, ub+1):
        if i%2 == 0:
            evenSum += i
        else:
            oddSum += i

    return oddSum, evenSum

lb = int(input("Enter lower bound: "))
ub = int(input("Enter upper bound: "))

if(lb > ub):
    print("Provide valid input range")

oddSum, evenSum = sumOddEven(lb, ub)

print(f"The odd sum is: {oddSum}")
print(f"The even sum is: {evenSum}")
print(f"The absolute difference is: {abs(oddSum - evenSum)}")