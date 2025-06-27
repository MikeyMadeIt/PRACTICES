def fibonacci(term):
   a, b = 0, 1
   if term <= 0:
      print("Must be a positive integer")
   elif term == 1:
      print(a)
   else:
      print("Fibonacci Sequence: ")
      for _ in range(term):
         print(a, end=" ")
         a, b = b, a + b
         
fibonacci(15)