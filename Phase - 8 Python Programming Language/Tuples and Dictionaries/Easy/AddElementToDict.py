d = {}

print("Empty Dictionary:")
print(d)

d[0] = input()
d[2] = input()
d[3] = input()

print("\nDictionary after adding 3 elements:")
print(d)

d[2] = input()

print("\nUpdated key value:")
print(d)

nested = eval(input())

d[5] = nested

print("\nAdding a Nested Key:")
print(d)