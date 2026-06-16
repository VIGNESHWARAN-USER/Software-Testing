s = input()

words = s.split()

smallest = words[0]

for word in words:
    if len(word) < len(smallest):
        smallest = word

print("Smallest word:")
print(smallest)