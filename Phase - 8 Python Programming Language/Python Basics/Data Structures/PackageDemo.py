import calculator.addition as add
import calculator.subraction as sub
import calculator.multiplication as mul
import calculator.division as div

num1 = int(input("Enter num1: "))
num2 = int(input("Enter num2: "))

print(add.add(num1, num2))
print(sub.sub(num1, num2))
print(mul.mul(num1, num2))
print(div.div(num1, num2))