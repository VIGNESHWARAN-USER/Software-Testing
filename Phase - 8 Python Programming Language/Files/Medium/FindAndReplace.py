def find_and_replace(file_path, old_text, new_text):
    with open(file_path, "r") as file:
        content = file.read()

    content = content.replace(old_text, new_text)

    with open(file_path, "w") as file:
        file.write(content)

    with open(file_path, "r") as file:
        print(file.read())


file_name = input()
old_text = input()
new_text = input()

find_and_replace(file_name, old_text, new_text)