month = int(input("Enter month number: "))
year = int(input("Enter year: "))

months = [
    "", "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
]

if month == 2:
    if (year % 400 == 0) or (year % 4 == 0 and year % 100 != 0):
        days = 29
    else:
        days = 28
elif month in [4, 6, 9, 11]:
    days = 30
else:
    days = 31

print(months[month], year, "has", days, "days")