try:
    quantity = int(input("Enter quantity of books: "))
    print("Quantity:", quantity)

except ValueError:
    print("Error: Input should be a valid integer.")

try:
    price = float(input("Enter price of the book: "))
    print("Price:", price)

except ValueError:
    print("Error: Invalid price format. Please enter price again.")

inventory = [10, 20, 30, 40, 50]

try:
    index = int(input("Enter inventory index: "))
    print("Book Quantity:", inventory[index])

except IndexError:
    print("Error: Specified index is out of bounds.")

except ValueError:
    print("Error: Invalid index.")