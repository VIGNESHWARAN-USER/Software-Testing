class Student:
    def __init__(self):
        self.name = "John"
        self.__age = 30
    
    def getAge(self):
        return self.__age

obj = Student()

print(obj.name)
print(obj.getAge())