def read_file(file_path):
    with open(file_path, "r") as file:
        print(file.read())


file_name = input()
read_file(file_name)