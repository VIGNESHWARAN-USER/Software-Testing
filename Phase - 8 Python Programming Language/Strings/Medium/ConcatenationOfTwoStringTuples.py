t1 = eval(input())
t2 = eval(input())

result = tuple(a + b for a, b in zip(t1, t2))

print("The concatenated tuple:", result)