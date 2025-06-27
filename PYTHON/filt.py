grades = []

while True:
   print("1. Add Scores")
   print("2. Check Result")
   print("3. Exit")
   choice = int(input("Your choice: "))
   
   if choice == 1:
      limit = int(input("Enter how many values: "))
      for i in range(limit):
         values = int(input(f"Enter value {i + 1}: "))
         grades.append(values)
         
      scores = list(filter(lambda x: x >= 35, grades))
   
   elif choice == 2:
      count = 0
      for score in scores:
         print(f"- {score}")
         count += 1
      print(f"Total number of who passed: {count}")
      
   elif choice == 3:
      print("Thank you!")
      break
   
   else: 
      print("Error")
      break