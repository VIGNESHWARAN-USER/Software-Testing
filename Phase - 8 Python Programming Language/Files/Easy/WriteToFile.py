def write_to_file(file_path, message):
    with open(file_path, "w") as file:
        file.write(message)

    with open(file_path, "r") as file:
        print(file.read())


file_name = input()
message = input()

write_to_file(file_name, message)