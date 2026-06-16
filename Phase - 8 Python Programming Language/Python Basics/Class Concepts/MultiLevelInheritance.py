class Student:
    def getStudentInfo(self):
        self.__rollno = input("Enter roll nuber: ")
        self.__name = input("Enter the name: ")

    def printStudentInfo(self):
        print(f"Roll Number: {self.__rollno}\nName: {self.__name}")
    

class Mark(Student):
    def getMarks(self):
        self.getStudentInfo()
        self.__mark1 = float(input("Enter mark 1: "))
        self.__mark2 = float(input("Enter mark 2: "))
        self.__mark3 = float(input("Enter mark 3: "))

    def printMarks(self):
        print(f'''----Marks----
Mark in subject 1: {self.__mark1}
Mark in subject 2: {self.__mark2}
Mark in subject 3: {self.__mark3}''')
        
    def calcTotalMarks(self):
        return self.__mark1 + self.__mark2 + self.__mark3
    
class Result(Mark):
    def getResult(self):
        self.getMarks()
        self.__total = self.calcTotalMarks()

    def putResult(self):
        self.printMarks()
        print(f"Total marks out of 300: {self.__total}")


obj = Result()
obj.getResult()
obj.putResult()