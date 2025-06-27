foods = []
prices = []
total = 0

choice = int(input("1. Order 2. View Orders 3. Exit"))

while not choice == 3:
   if choice == 1:
      food = input("What would you like to buy?: ")
      price = float(input("Enter the price: "))
      foods.append(food)
      prices.append(price)
      total += price
      print()
      print("You have successfully bought it.")
      choice = int(input("1. Order 2. View Orders 3. Exit: "))
   elif choice == 2:
      print(f"You have bought: {foods}")
      print(f"Your total purchase is: ${total:,.2f}")
      print()
      choice = int(input("1. Order 2. View Orders 3. Exit: "))

print("Thankyou! Comeback again!")