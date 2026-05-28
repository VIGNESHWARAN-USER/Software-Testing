lb = int(input("Enter lower bound: "))
ub = int(input("Enter upper bound: "))

for num in range(lb, ub):
    if(num > 1):
        for i in range(2, num//2+1):
            if(num%i == 0):
                break;
        else:
            print(num ,end = " ")