def printPrimeNumbers(lb, ub):

    flag = True
    for i in range(lb, ub+1):
        flag = True
        for j in range(2, i//2+1):
            if i%j == 0:
                flag = False
                break
        if(flag):
            print(i)
        

lb = int(input("Enter lower bound: "))
ub = int(input("Enter upper bound: "))

if(lb > ub):
    print("Provide valid input range")

printPrimeNumbers(lb, ub)