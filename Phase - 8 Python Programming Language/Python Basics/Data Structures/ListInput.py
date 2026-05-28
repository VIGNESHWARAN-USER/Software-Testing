n = int(input("Enter the size of the list: "))
l = input(f"Enter the {n} elements as comma seperated: ").split(",")[:n]

print(type(l[0]))

l = list(map(float, input(f"Enter the {n} elements as comma seperated: ").split(",")[:n]))

print(l)