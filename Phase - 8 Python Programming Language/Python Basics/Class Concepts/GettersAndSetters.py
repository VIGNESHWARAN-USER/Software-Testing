class Student:
    def __init__(self):
        self.name = "John"
        self.__age = 30
    
    def getAge(self):
        return self.__age
    
    def setAge(self, age):
        self.__age = age
    
class Subject(Student):
    pass
    

obj = Subject()

print(obj.name)
print(obj._age())