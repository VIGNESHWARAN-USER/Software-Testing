def append_to_file(file_path, message):
    with open(file_path, "a") as file:
        file.write("\n" + message)

    with open(file_path, "r") as file:
        print(file.read())


file_name = input()
message = input()

append_to_file(file_name, message)