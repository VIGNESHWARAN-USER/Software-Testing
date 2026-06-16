class demo:
    name = None
    age = None

    def __init__(self, name, age = 21):
        self.name = name
        self.age = age
    
    def greetUser(self):
        print(f"Welcome {self.name}!")
    
    def getAge(self):
        print(f"The age is: {self.age}")

    def __str__(self):
        return f"The name of the user is {self.name}\nThe age of the user is: {self.age}"


obj = demo("Vigneshwaran")
obj.greetUser()
obj.getAge()
print(obj)
print()
obj = demo("Vigneshwaran", 20)
obj.greetUser()
obj.getAge()
print(obj)
