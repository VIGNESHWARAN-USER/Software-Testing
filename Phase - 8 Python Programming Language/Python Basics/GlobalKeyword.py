num = 2

def demo():
    global num
    num =  num * 5
    print(f"Inside function num = {num}")

demo()
print(f"Outside function num = {num}")