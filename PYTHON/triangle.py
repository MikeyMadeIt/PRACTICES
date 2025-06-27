base = float(input("Enter the base: "))
height = float(input("Enter the height: "))

def area(base, height):
   area = (base * height) / 2
   return area

print(f"The are is: {area(base, height)}")