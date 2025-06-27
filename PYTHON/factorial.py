num = int(input("Factorial of: "))

def factorial(n):
   if n < 0:
      return "Factorial is not defined for negative numbers."
   elif n == 0 or n == 1:
      return 1
   else:
      return n * factorial(n - 1)
      
result = factorial(num)
print(f"The factorian of {num} is: {result}")
