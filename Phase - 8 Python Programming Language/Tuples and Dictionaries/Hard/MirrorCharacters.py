k = int(input())
s = input()

result = s[:k - 1]

for ch in s[k - 1:]:
    if ch.isalpha():
        result += chr(ord('z') - (ord(ch.lower()) - ord('a')))
    else:
        result += ch

print(result)