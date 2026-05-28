class Example:
    def method(self, a, b=None):
        if b is None:
            print(f"Single argument: {a}")
        elif(isinstance(a, int) and isinstance(b, int)):
            print(f"Two integers: {a}, {b}")
        elif(isinstance(a, str) and isinstance(b, str)):
            print(f"Two strings: {a}, {b}")
        else:
            print(f"Mixed types: {a}, {b}")

obj = Example()

obj.method(1)
obj.method(1, 2)
obj.method('a', 'b')
obj.method(1, 'b')