class Student:
   def __init__(self, name):
      self.name = name
      self.grades = []
      
   def add_grade(self, num):
      for i in range(num):
         value = int(input(f"Enter value {i + 1}: "))
         self.grades.append(value)
         
   def show_average(self):
      sum = 0
      for grade in self.grades:
         sum += grade
      sum /= len(self.grades)
      print(f"The average is: {sum:,.2f}")
   
   def show_all(self):
      print(f"Name: {self.name}")
      print("Here's your grades:")
      for grade in self.grades:
         print(f"- {grade}")
      self.show_average()

def print_choices():
   print("1. Add Grades")
   print("2. Get Average")
   print("3. Show Grades and Average")
   print("4. Exit Menu")

name = input("What is your name: ")
student = Student(name)
   
while True:
   print_choices()
   choice = int(input("Your choice: "))
   
   if choice == 1:
      num = int(input("How many grades do you want to add: "))
      student.add_grade(num)
   elif choice == 2:
      student.show_average()
   elif choice == 3:
      student.show_all()
   elif choice == 4:
      print("Thank you!")
      break