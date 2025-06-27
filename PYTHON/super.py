class Shape:
   def __init__(self, color):
      self.color = color
      
   def describe(self):
      print(f"The color is {self.color}")
      
class Rectangle(Shape):
   def __init__(self, color, width, height):
      super().__init__(color)
      self.width = width
      self.height = height
      
rectangle = Rectangle("blue", 50, 30)

print(rectangle.color)
print(rectangle.width)
print(rectangle.height)

rectangle.describe()
