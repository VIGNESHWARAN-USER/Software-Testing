def manage_student_grades(input_file, output_file):
    with open(input_file, "r") as infile, open(output_file, "w") as outfile:

        for line in infile:
            data = [item.strip() for item in line.strip().split(",")]

            student_id = data[0]
            name = data[1]

            grades = list(map(float, data[2:]))
            average = sum(grades) / len(grades)

            outfile.write(f"{student_id}, {name}, {average:.2f}\n")

    with open(output_file, "r") as file:
        print(file.read())


input_file = input().strip()
output_file = input().strip()

manage_student_grades(input_file, output_file)