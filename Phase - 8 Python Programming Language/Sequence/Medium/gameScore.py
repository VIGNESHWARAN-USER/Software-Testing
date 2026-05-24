score = int(input("Enter your score: "))
if(score < 0 or score > 100):
    print("Invalid score")
else:
    print(f"Your score is: {score}")