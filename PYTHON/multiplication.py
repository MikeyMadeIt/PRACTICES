print("--- MULTIPLICATION TABLE GENERATOR ---")

num = int(input("Enter a number: "))
lmt = int(input("Enter a limit: "))

print("")

print("**********")
for i in range(1, lmt + 1):
   result = num * i
   print(f"{num} x {i:02d} = {result:02d}")
print("**********")