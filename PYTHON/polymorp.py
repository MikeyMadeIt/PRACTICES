import math as m
from abc import ABC, abstractmethod

class Shape:
   @abstractmethod
   def area(self):
      pass

class Circle(Shape):
   def __init__(self, radius):
      self.radius = radius
      
   def area(self):
      area = m.pi * m.pow(self.radius, 2)
      return area
   
class Square(Shape):
   def __init__(self, side):
      self.side = side
      
   def area(self):
      area = m.pow(self.side, 2)
      return area

class Triangle(Shape):
   def __init__(self, base, height):
      self.base = base
      self.height = height
      
   def area(self):
      area = self.base * self.height
      return area
 
class Frame(Square):
   def __init__(self, title, side):
      super().__init__(side)
      self.title = title
      
class Electricfan(Circle):
   def __init__(self, brand, radius):
      super().__init__(radius)
      self.brand = brand
      
shapes = [Circle(15),
          Square(10),
          Triangle(10, 15),
          Frame("Mikey", 17),
          Electricfan("Hanabishi", 25)]

for shape in shapes:
   print(f"- {shape.area():,.2f}")