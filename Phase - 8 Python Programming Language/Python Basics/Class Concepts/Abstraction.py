from abc import ABC, abstractmethod

class Animal(ABC):

    @abstractmethod
    def make_sound(self):
        print("Hi")

class Dog(Animal):

    def make_sound(self):
        return super().make_sound()
    
dog = Dog()
dog.make_sound()