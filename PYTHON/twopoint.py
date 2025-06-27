import math

x1 = float(input("Enter the value of x1: "))
y1 = float(input("Enter the value of y1: "))
x2 = float(input("Enter the value of x2: "))
y2 = float(input("Enter the value of y2: "))

def distance(x1, x2, y1, y2):
   distance = math.pow(x2 - x1, 2) + math.pow(y2 - y1, 2)
   distance = math.sqrt(distance)
   return distance
   
def slope_and_line(x1, y1, x2, y2):
   a = y2 - y1
   b = x2 - x1 
   c = a / b
   return c

def midPointA(x1, x2):
   midpointA = x1 + x2
   midpointA /= 2 
   return midpointA

def midPointB(y1, y2):
   midpointB = y1 + y2
   midpointB /= 2 
   return midpointB
   
print(f"The distance between two points is: {distance(x1, x2, y1, y2):,.2f}")
print(f"The slope and line is: {slope_and_line(x1, x2, y1, y2):,.2f}")
print(f"The midpoints is: {midPointA(x1, x2):,.0f} and {midPointB(y1, y2):,.0f}")