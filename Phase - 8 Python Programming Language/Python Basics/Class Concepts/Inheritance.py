class Vehicle:
    def __init__(self, name, color, place):
        self.name = name
        self.color = color
        self.place = place

    def show(self):
        print(f"Details: {self.name}, {self.color}, {self.place}")

    def maxSpeed(self):
        print("Vehicle max speed is 150.")
    
    def changeGear(self):
        print("Vehicle change 6 gear.")

class Car(Vehicle):
    def maxSpeed(self):
        super().maxSpeed()
        print("Car max speed is 240.")

    def changeGear(self):
        super().changeGear()
        print("Car change 7 gear")

car = Car('Car X1', 'Red', '200000')
car.show()
car.maxSpeed()
car.changeGear()
print()
vehicle = Vehicle('Vehicle X1', 'Red', '200000')
vehicle.show()
vehicle.maxSpeed()
vehicle.changeGear()