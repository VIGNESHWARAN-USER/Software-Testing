def calculateSalary(salary, hike):
    return salary + (salary * hike/100)

salary = float(input("Enter your salary: "))
hike = float(input("Enter your hike percentage: "))

print(f"Your new salary will be: {calculateSalary(salary, hike)}")
