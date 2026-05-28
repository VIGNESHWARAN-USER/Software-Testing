class demo:
    name = None

    def __init__(self, name):
        self.name = name
    
    def greetUser(self):
        print(f"Welcome {self.name}!")

def main():
    obj = demo("Vigneshwaran")
    obj.greetUser()

if __name__ == "__main__":
    main()