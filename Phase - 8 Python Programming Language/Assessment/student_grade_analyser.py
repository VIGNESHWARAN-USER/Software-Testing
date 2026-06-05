studentData = dict()

n = int(input("Enter number of students: "))

for i in range(n):
    usn = input(f"Enter the USN Number of student {i+1}: ")
    mark = input(f"Enter the mark of student {i+1}: ")
    studentData[usn] = mark


maxMark = 0
maxId = ""
minMark = 100
minId = ""
distinction, merit, belowAvg = [], [], []
passsedStudents, failedStudents, classAvg = 0, 0, 0

for i in studentData:

    studentMark = int(studentData[i])

    if(studentMark > 85):
        distinction.append(i)
        passsedStudents+=1
    elif(studentMark > 75):
        merit.append(studentMark)
        passsedStudents+=1
    elif(studentMark >= 60):
        passsedStudents+=1
    else:
        belowAvg.append(studentMark)
        failedStudents+=1
    classAvg += studentMark
    if(studentMark > maxMark):
        maxMark = studentMark
        maxId = i
    if(studentMark < minMark):
            minMark = studentMark
            minId = i


print(f"Maximum mark: {maxMark} - {maxId}")
print(f"Minimum mark: {minMark} - {minId}")
print(f"Distinction: {len(distinction)} ->  {distinction}")
print(f"Merit: {len(merit)} ->  {merit}")
print(f"Pass : {passsedStudents} | fail : {failedStudents}")
print(f"Class Average: {classAvg/n}")
print(f"Below Average: {len(belowAvg)} -> {belowAvg}")
