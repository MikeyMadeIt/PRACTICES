class BankAccount:
   def __init__(self, acc_num, owner, amount):
      self.acc_num = acc_num
      self.owner = owner
      self.balance = amount
   
   def deposit(self, amount):
      self.balance += amount
      print(f"You successfully deposit ${amount:,.2f} to your account")
      return self.balance
   
   def withdraw(self, w_amount):
      if w_amount > self.balance:
         print("You cannot withdraw more than your balance!")
      else:
         self.balance -= w_amount
         print(f"You successfully withdraw ${w_amount:,.2f} to your account")
         return self.balance
         
   def display_balance(self):
      print(f"Account ID: {self.acc_num}")
      print(f"Owner Name: {self.owner}")
      print(f"Balance: ${self.balance:,.2f}")
      
class Choice:
   def print_choices():
      print("1. Deposit")
      print("2. Withdraw")
      print("3. Display Balance")
      print("4. Exit")

account = BankAccount("111", "Mikey", 0)

Choice.print_choices()
choice = int(input("Your choice: "))

while True:
   if choice == 1:
      amount = float(input("How much you want to deposit: $"))
      account.deposit(amount)
         
      Choice.print_choices()
      choice = int(input("Your choice: "))
         
   elif choice == 2:
      w_amount = float(input("How much you want to withdraw: $"))
      account.withdraw(w_amount)
         
      Choice.print_choices()
      choice = int(input("Your choice: "))
         
   elif choice == 3:
      account.display_balance()
      
      Choice.print_choices()
      choice = int(input("Your choice: "))
      
   elif choice == 4:
      break
   
   else:
      print("Error")

print(f"Thank you! {account.owner}!")