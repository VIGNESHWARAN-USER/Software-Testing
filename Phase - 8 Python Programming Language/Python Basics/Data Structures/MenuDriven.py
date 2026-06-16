def square(side):
    return side ** 2

def rectangle(length, breadth):
    return length * breadth

def circle(radius):
    return 3.14 * radius ** 2

print("-------------Menu Driven Program-------------")
print("1. Area of square")
print("2. Area of rectangle")
print("3. Area of circle")

while(True):
    choice = int(input("Enter your choice: "))
    
    if choice == 1:
        side = float(input("Enter the side of the square: "))
        area = square(side)
        print(f"The area of square is: {area}")
    elif choice == 2:
        length = float(input("Enter the length of the rectangle: "))
        breadth = float(input("Enter the breadth of the rectangle: "))
        area = rectangle(length, breadth)
        print(f"The area of rectangle is: {area}")
    elif choice == 3:
        radius = float(input("Enter the radius of the circle: "))
        area = circle(radius)
        print(f"The area of circle is: {area}")
    elif choice == 4:
        print("Exiting program.")
        break;
    else: 
        print("Invalid choice, Try again.")
    



