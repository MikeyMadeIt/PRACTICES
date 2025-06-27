class Grocery_List:
   def __init__(self):
      self.item = []
      
   def add_item(self, item):
      self.item.append(item)
      print(f"You added {item} to the list")
      
   def show_items(self):
      if self.item:
         print("Here's the items in your list: ")
         for item in sorted(self.item):
            print(f"- {item}")
      else:
         print("There's nothing on the list")
         
   def remove_item(self, item):
      if item in sorted(self.item):
         self.item.remove(item)
         print("Item is removed")
      else:
         print("This item is not in the list")
         
class Choices:
   def print_choices():
      print("1. Add Item")
      print("2. Remove Item")
      print("3. View List")
      print("4. Exit")
      
grocery = Grocery_List()

while True:
   Choices.print_choices()
   choice = int(input("Enter your choice: "))

   if choice == 1:
      item = input("What item do you want to add: ").lower().strip()
      grocery.add_item(item)
      
   elif choice == 2:
      item = input("What item you want to remove: ").lower().strip()
      grocery.remove_item(item)
   
   elif choice == 3:
      grocery.show_items()
   
   elif choice == 4:
      print("Thankyou!")
      break
     
   else:
      print("Error")
      break