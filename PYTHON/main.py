name = input("Enter your name: ")

if len(name) > 12:
   print("Name must contain 12 characters only.")
elif not name.find(" ") == -1:
   print("Name must not contain spaces.")
elif not name.isalpha():
   print("Name must not contain digits.")
else:
   print("good")