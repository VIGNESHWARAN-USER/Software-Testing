def calculateSalary(salary, hike):

    if(hike > 7):
        salary += salary * 0.30
    elif(hike > 4):
        salary += salary * 0.25
    else:
        salary += salary * 0.10

    return salary

salary = float(input("Enter your salary: "))
hike = float(input("Enter your apraisal rating: "))

if(salary < 0 or hike not in range(1, 10)):
    print("Invalid Input")

print(f"Your new salary will be: {calculateSalary(salary, hike)}")
