test_list = input()
k = int(input())

test_list = eval(test_list)

result = []

for item in test_list:
    if len(item) != k:
        result.append(item)

print(result)