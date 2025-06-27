a = float(input("Enter the first number: "))
b = float(input("Enter the second number: "))
operator = input("Enter an operation (+ - * /): ").strip()

add = lambda a, b: a + b
subtract = lambda a, b: a - b
multiply = lambda a, b: a * b
divide = lambda a, b: a / b

match operator:
   case '+':
      print(f"Result = {add(a, b):,.2f}")
   case '-':
      print(f"Result = {subtract(a, b):,.2f}")
   case '*':
      print(f"Result = {multiply(a, b):,.2f}")
   case '/':
      if a == 0 or b == 0:
         print("Can't divide to zero")
      else:
         print(f"Result = {divide(a, b):,.2f}")
   case _:
      print("Error")