from datetime import date

bddate = input("Enter your Birth Date: (YYYY-MM-DD): ")
bddate = bddate.split("-")

today = str(date.today()).split("-")

age = int(today[0]) - int(bddate[0])

if(int(today[1]) < int(bddate[1]) and int(today[2]) < int(bddate[2])):
    age -= 1

print(f"Your age is: {age} years")