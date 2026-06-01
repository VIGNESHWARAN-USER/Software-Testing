def generate_salary_report(employee_file, report_file):
    with open(employee_file, "r") as infile, open(report_file, "w") as outfile:

        for line in infile:
            data = [item.strip() for item in line.strip().split(",")]

            emp_id = data[0]
            name = data[1]
            hourly_wage = float(data[2])
            hours_worked = float(data[3])

            total_salary = hourly_wage * hours_worked

            outfile.write(f"{emp_id}, {name}, {total_salary:.2f}\n")

    with open(report_file, "r") as file:
        print(file.read())


employee_file = input().strip()
report_file = input().strip()

generate_salary_report(employee_file, report_file)