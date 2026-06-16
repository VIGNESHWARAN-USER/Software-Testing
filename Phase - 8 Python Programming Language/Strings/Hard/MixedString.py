s1 = input()
s2 = input()

result = ""

for i in range(min(len(s1), len(s2))):
    result += s1[i]
    result += s2[-(i + 1)]

if len(s1) > len(s2):
    result += s1[len(s2):]
elif len(s2) > len(s1):
    result += s2[:len(s2) - len(s1)]

print(result)