class Complex:
    def __init__(self, r, i):
        self.real = r
        self.img  = i

    def __add__(self, sec):
        r = self.real + sec.real
        i = self.img + sec.img
        return Complex(r, i)
    
    def __str__(self):
        return f"{self.real} {self.img}i"
    
com1 = Complex(5, 4)
com2= Complex(3, 2)

print(com1)
print(com2)
print(com1 + com2)