from collections import defaultdict

k = int(input())
lst = eval(input())

freq = defaultdict(int)
result = []

for item in lst:
    if freq[item[0]] < k:
        result.append(item)
        freq[item[0]] += 1

print(result)