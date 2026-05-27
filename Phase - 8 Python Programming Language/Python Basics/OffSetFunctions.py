with open("sample.txt", 'r+') as file:
    print(file.tell())
    print(file.read(10))
    print(file.tell())
    # file.seek(10, 1)
    # print(file.tell())
    