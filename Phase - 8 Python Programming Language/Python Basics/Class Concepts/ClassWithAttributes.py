class demo:

    x = 5;

    def display(self):
        print("This is a function")

    def greet(self, name):
        print(f"Welcome {name}")

obj = demo()

obj.display()
obj.greet("Vigneshwaran")
print(obj.x)