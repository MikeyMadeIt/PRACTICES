import math

radius = float(input("Enter the radius: "))
height = float(input("Enter the height: "))

def volume_of_cylinder(radius, height):
   volume = math.pi * math.pow(radius, 2) * height
   return volume
   
print(f"The volume is: {volume_of_cylinder(radius, height):,.2fm²}")