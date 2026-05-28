from itertools import combinations

def subset_sum_to_target(input_set, target_sum):
    nums = list(input_set)
    result = []

    for r in range(1, len(nums) + 1):
        for subset in combinations(nums, r):
            if sum(subset) == target_sum:
                result.append(set(subset))

    return result

input_set = eval(input())
target_sum = int(input())

print(subset_sum_to_target(input_set, target_sum))