person = eval(input())

try:
    print(person["name"])
except KeyError:
    print("Error: Key not found!")