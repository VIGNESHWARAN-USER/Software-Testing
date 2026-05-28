def appendElement(l, val):
    l.append(val)

def insertElement(l, val, pos):
    l.insert(pos, val)

def appendList(l, list):
    l.extend(list)

def modifyElement(l, val, pos):
    l[pos] = val

def deleteByPosition(l, pos):
    l.pop(pos)

def deleteByElement(l, val):
    l.remove(val)

def sortInAscending(l):
    l.sort();

def sortInDescending(l):
    l.sort(reverse = True)

l = input("Enter the list elements as comma seperated values: ").split(",")
print("--------------List Operations--------------")
print("1. Append an element")
print("2. Insert an element")
print("3. Append a list to the given list")
print("4. Modify an existing list")
print("5. Delete an existing element from its position")
print("6. Delete an existing element with a given value")
print("7. Sort the list in ascending order")
print("8. Sort the list in descending order")
print("9. Display the list")

while(True):
    choice = int(input("Enter your choice: "))

    match choice:
        case 1:
            val = input("Enter the element: ")
            appendElement(l, val)
        case 2:
            val = input("Enter the element: ")
            pos = int(input("Enter position: "))
            insertElement(l, val, pos)
        case 3:
            list = input("Enter the elements as comma seperated: ").split(",")
            appendList(l, list)
        case 4:
            val = input("Enter the element: ")
            pos = int(input("Enter position: "))
            modifyElement(l, val, pos)
        case 5:
            pos = int(input("Enter position: "))
            deleteByPosition(l, pos)
        case 6:
            val = input("Enter element: ")
            deleteByElement(l, val)
        case 7:
            sortInAscending(l)
        case 8:
            sortInDescending(l)
        case 9:
            print(l)


