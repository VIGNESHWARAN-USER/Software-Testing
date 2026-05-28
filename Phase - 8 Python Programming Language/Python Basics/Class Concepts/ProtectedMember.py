class Student:
    def __init__(self):
        self.name = "John"
        self._age = 30
    
    def getAge(self):
        pass
    
class Subject(Student):
    pass
    

obj = Subject()

print(obj.name)
print(obj._age())