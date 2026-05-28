with open("sample.txt", "w") as file:
    strings = ["This is first line\n", "This is second line\n", "This is third line\n"]
    print(file.writelines(strings))