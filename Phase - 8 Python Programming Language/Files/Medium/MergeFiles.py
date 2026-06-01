def merge_files(file1, file2, output_file):
    with open(file1, "r") as f1:
        content1 = f1.read()

    with open(file2, "r") as f2:
        content2 = f2.read()

    with open(output_file, "w") as out:
        out.write(content1)
        out.write("\n")
        out.write(content2)

    with open(output_file, "r") as out:
        print(out.read())


file1 = input()
file2 = input()
output_file = input()

merge_files(file1, file2, output_file)