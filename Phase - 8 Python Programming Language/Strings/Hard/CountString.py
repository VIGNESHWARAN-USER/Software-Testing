s = input()

lower = 0
upper = 0
non_letters = 0

for ch in s:
    if ch.islower():
        lower += 1
    elif ch.isupper():
        upper += 1
    else:
        non_letters += 1

print("Lower case letters", lower)
print("Upper case letters", upper)
print("Non - letters:", non_letters)