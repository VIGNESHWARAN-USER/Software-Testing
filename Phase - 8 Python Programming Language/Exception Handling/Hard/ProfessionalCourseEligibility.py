try:
    maths = int(input())
    physics = int(input())
    chemistry = int(input())

    total = maths + physics + chemistry

    if maths >= 65 and physics >= 55 and chemistry >= 50 and total >= 180:
        print("Eligible")
    else:
        raise Exception("Not Eligible")

except Exception as e:
    print(e)