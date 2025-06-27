import math

a = float(input("Enter the side a: "))
b = float(input("Enter the side b: "))
c = float(input("Enter the side c: "))

def sides(a, b, c):
   res = a + b + c
   res /= 2
   return res
   
def area_of_triangle(a, b, c):
   s = sides(a, b, c)
   area = s * (s - a) * (s - b) * (s - c)
   area = math.sqrt(area)
   return area
   
print(f"The Area is: {area_of_triangle(a, b, c):,.2f}")