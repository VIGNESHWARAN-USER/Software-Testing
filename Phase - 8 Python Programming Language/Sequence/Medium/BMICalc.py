weight = abs(float(input("Enter the weight: ")))
height = abs(float(input("Enter the height: ")))

bmi = weight / height**2

print(f"Your BMI is: {bmi}")