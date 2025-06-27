a = int(input("Enter first number: "))
b = int(input("Enter second number: "))
c = input("Enter an operator (+ - * /): ")

def add(a, b):
   return a + b

def multiply(a, b):
   return a * b

def subtruction(a, b):
   return a - b

def divide(a, b):
   return a / b
   
if c == "/" and b == 0:
   print("Can't divide by zero")
elif c not in ("+", "-", "*", "/"):
   print("Invalid Operator!")
elif c == "+":
   print(add(a, b))
elif c == "-":
   print(subtruction(a, b))
elif c == "*":
   print(multiply(a, b))
elif c == "/":
   print(divide(a, b))
else:
   print("Error!")