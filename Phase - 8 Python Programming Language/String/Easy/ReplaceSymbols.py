s = input()

result = ""

for ch in s:
    if ch.isalnum() or ch == " ":
        result = result + ch
    else:
        result = result + "#"

print(result)