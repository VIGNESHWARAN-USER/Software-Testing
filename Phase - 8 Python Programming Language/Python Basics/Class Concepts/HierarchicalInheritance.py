class Num:
    def __init__(self):
        self.x = 20
        self.y = 10

class Add(Num):

    def findSum(self):
        print(self.x + self.y)

class Sub(Num):

    def findDifference(self):
        print(self.x - self.y)

obj = Add()
obj1 = Sub()
obj.findSum()
obj1.findDifference()