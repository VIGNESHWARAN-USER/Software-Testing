from collections import Counter

lst = eval(input())

freq = Counter(lst)

count = 0

for item in freq:
    rev = (item[1], item[0])

    if item < rev:
        count += freq[item] * freq.get(rev, 0)

print("Bidirectional pairs count :", count)