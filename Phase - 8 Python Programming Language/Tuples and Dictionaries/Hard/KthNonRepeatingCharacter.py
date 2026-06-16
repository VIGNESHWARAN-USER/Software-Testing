from collections import Counter

s = input()
k = int(input())

freq = Counter(s)

chars = []

for ch in s:
    if freq[ch] == 1:
        chars.append(ch)

if len(chars) >= k:
    print(chars[k - 1])
else:
    print("Less than k non-repeating characters in input.")