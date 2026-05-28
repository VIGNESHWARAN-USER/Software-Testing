with open("sample.txt", 'w') as file:
    content = input("Enter the content to write in file: ")
    for i in content.split(r"\n"):
        file.write(i+"\n")
    
with open("sample.txt", 'r') as file:
    print("Now reading the contents of the file.")
    content = file.readlines()
    for i in content:
        print(i, end="")