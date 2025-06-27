import math

start = int(input("What number to start: "))
stop = int(input("What number to stop: "))

for num in range(start, stop + 1):
   if num < 2:
      continue
   
   prime = True
   for i in range(2, int(math.sqrt(num) + 1)):
      if (num % i == 0):
         prime = False
         break
   if prime:
      print(f"{num:02d}")