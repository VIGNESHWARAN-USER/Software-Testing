test_list = eval(input())
k = int(input())

result = []

for item in test_list:
    if len(item) != k:
        result.append(item)

print(result)