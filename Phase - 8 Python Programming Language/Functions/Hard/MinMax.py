def findMinMax(*nums):
    min, max = nums[0], nums[0]

    for num in nums:
        if(num < min):
            min = num
        if(num > max):
            max = num

    return min, max

min, max = findMinMax(1, 2, 3, 4, 5, 6, 7, 8)

print(f"The minimum element is: {min}")
print(f"The maximum element is: {max}")