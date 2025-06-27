import math

weight = float(input("Enter you weight (kg): "))
height = float(input("Enter your height (m): "))

def height_squared(height):
   height_in_squared = math.pow(height, 2)
   return height_in_squared
   
def the_bmi(weight, height):
   m = height_squared(height)
   kg = weight
   body_mass_index = kg / m
   return body_mass_index
   
if the_bmi(weight, height) < 18.5:
   print()
   print(f"Your Body Mass Index is: {the_bmi(weight, height):,.2f}")
   print("You are Underweight")
elif the_bmi(weight, height) >= 18.5 and the_bmi(weight, height) <= 24.9:
   print()
   print(f"Your Body Mass Index is: {the_bmi(weight, height):,.2f}")
   print("You are Healthy")
elif the_bmi(weight, height) >= 25.0 and the_bmi(weight, height) <= 29.9:
   print()
   print(f"Your Body Mass Index is: {the_bmi(weight, height):,.2f}")
   print("You are Overweight")
elif the_bmi(weight, height) >= 30.0:
   print()
   print(f"Your Body Mass Index is: {the_bmi(weight, height):,.2f}")
   print("You are Obesity")
else:
   print("Error")