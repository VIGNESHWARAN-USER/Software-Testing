from asyncio import to_thread
from traceback import print_tb


class Person:
    def __init__(self, name, age, email):
        self.name = name
        self.age = age
        self.email = email

    def display_info(self):
        print(f"Name: {self.name} | Age: {self.age} | Email: {self.email}")

class Trainee(Person):

    def __init__(self, name, age, email, batch_id, marks, num_projects, num_publications):
        super.__init__(name, age, email)
        self.batch_id = batch_id
        self.marks = marks
        self.num_projects = num_projects
        self.num_publications = num_publications
        self.avg = 0
        for mark in self.marks:
            self.avg += int(mark)
        self.avg /= len(self.marks)

    def display_info(self):
        print(f"Name: {self.name} | Age: {self.age} | Email: {self.email}")
        print(f"Batch: {self.batch_id}")
        
        print(f"Marks: {self.marks} Avg: {self.avg}")
        print(f"Projects : {self.num_projects} | Publications : {self.num_publications}")

class SDETTrainee(Trainee):
    def __init__(self, name, age, email, batch_id, marks, num_projects, num_publications, tool_proficiency ):
            self.name = name
            self.age = age
            self.email = email
            self.batch_id = batch_id
            self.marks = marks
            self.num_projects = num_projects
            self.num_publications = num_publications
            self.tool_proficiency = tool_proficiency
            self.avg = 0
            for mark in self.marks:
                self.avg += int(mark)
            self.avg /= len(self.marks)
            self.aggregate = self.avg * 0.6 + self.num_projects * 5 + self.num_publications * 3
            
    
    def display_info(self):
        print(f"Name: {self.name} | Age: {self.age} | Email: {self.email}")
        print(f"Batch: {self.batch_id}")
        print(f"Marks: {self.marks} Avg: {self.avg}")
        print(f"Projects : {self.num_projects} | Publications : {self.num_publications}")
        print(f"Tool : {self.tool_proficiency}")
        print(f"Aggregate Score : {self.aggregate}")


n = int(input("Enter number of trainers: "))

employees = []

for i in range(n):
    print(f"Enter the details of tainer {i+1}")
    name = input("Enter the name: ")
    age = input("Enter the age: ")
    email = input("Enter the email: ")
    batch_id = input("Enter the batch id: ")
    marks = input("Enter the marks as space seperated values: ").split(" ")
    num_projects = int(input("Enter the number of projects: "))
    num_publications = int(input("Enter the number of publications: "))
    tool = input("Enter the proficient tool: ")

    employee = SDETTrainee(name, age, email, batch_id, marks, num_projects, num_publications, tool)
    employees.append(employee)

employeeToDisplay = employees[0]
for employee in employees:
    if(employee.aggregate > employeeToDisplay.aggregate):
        employeeToDisplay = employee


print("--- The trainer with High aggregated score ---")
employeeToDisplay.display_info()



