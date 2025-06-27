
class Rectangle:
   def __init__(self, width, height):
      self.width = width
      self.height = height
   
   def area(self):
      area = self.width * self.height
      return print(f"The area is: {area:,.2f}")
      
   def perimeter(self):
      perimeter = self.width + self.height
      perimeter *= 2
      return print(f"The perimeter is: {perimeter:,.2f}")
      
rect = Rectangle(20, 30)
print(rect.width)
print(rect.height)

rect.area()
rect.perimeter()