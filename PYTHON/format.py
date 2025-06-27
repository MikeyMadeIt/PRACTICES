name = input("Enter a name: ")

while True:
   if name == "":
      print("Name cant be empty")
      name = input("Enter a name: ")
   else:
      break
   
print(name)