total_price = 0
count = 1

while True:
    price = int(input(f"Enter the price of the item {count}: "))
    quantity = int(input(f"Enter the quantity of the item {count}: "))

    total_price += price * quantity

    choice = input("Do you want to enter another item? (yes/no): ")

    if choice.strip().lower() == "no":
        break

    count += 1

print("Total Price:", total_price)