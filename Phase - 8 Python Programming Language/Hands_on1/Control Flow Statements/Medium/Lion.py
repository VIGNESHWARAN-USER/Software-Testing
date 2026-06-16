total = int(input())
rabbit = int(input())
deer = int(input())
birds = int(input())
squirrels = int(input())

sum_animals = rabbit + deer + birds + squirrels

if sum_animals > total:
    print("Counted wrongly")
elif sum_animals == total:
    print("Baby lion is well behaved")
else:
    print("Baby lion is mischievous")