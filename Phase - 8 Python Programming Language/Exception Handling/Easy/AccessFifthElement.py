lst = eval(input())

try:
    print(lst[4])
except IndexError:
    print("Error: Index out of range!")