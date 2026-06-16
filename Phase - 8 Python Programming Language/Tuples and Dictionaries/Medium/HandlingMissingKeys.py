d = {'a': 1, 'b': 2, 'd': 3}

key = input()

try:
    print(f"The value associated with '{key}' is :", d[key])
except KeyError:
    print(f"The value associated with '{key}' is : Key Not found")