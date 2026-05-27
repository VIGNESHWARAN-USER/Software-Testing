products = input("Enter a list of product names separated by commas: ")

product_list = products.split(",")

print("List of Products:")

for product in product_list:
    print(product.strip())