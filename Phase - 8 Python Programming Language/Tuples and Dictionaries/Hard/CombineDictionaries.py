d1 = eval(input())
d2 = eval(input())

keys1 = list(d1.keys())
values2 = list(d2.values())

res = {}

for i in range(len(keys1)):
    res[keys1[i]] = values2[i]

print("Mapped dictionary :", res)