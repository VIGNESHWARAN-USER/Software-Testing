# l = list()
# print(type(l))
# print(f"Length: {len(l)}")

# l = list('aeiou')
# print(l)
# print(f"Length: {len(l)}")

# l = list(input("Enter the elements").split(", "))
# print(l)
# print(f"Length: {len(l)}")

# del l[3]
# print(l)
# print(f"Length: {len(l)}")


# for i in range(len(l)):
    # print(l[i], end=" ")

l = ["Tiger", "Zebra", "Elephant", "Dog", "Cat"]
l.sort()
print(l)
l.sort(reverse=True)
print(l)

l = [4, 2, 6, 2, 6, 89, 3, 0]
l.sort()
print(l)
l.sort(reverse=True)
print(l)

list = l.copy()

print(list is l)