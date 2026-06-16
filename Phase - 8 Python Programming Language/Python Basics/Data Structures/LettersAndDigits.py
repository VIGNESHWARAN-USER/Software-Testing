val = input("Enter the string: ")

letters, digits = 0, 0

for char in val:
    if(char.isalpha()):
        letters+=1
    elif(char.isnumeric()):
        digits+=1

print(f"Total number of letters: {letters}")
print(f"Total number of digits: {digits}")