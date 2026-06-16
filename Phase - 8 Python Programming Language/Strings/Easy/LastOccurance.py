text = input("Enter string: ")
word = input("Enter substring to search: ")

index = text.rfind(word)

if index != -1:
    print(f"Last occurrence of {word} starts at index {index}")
else:
    print("Substring not found")