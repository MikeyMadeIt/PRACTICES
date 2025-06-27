import random

random_number = random.randint(1, 101)
guess = int(input("Enter your guess: "))
attempt = 0

while True:
   if guess > random_number:
      print("TOO HIGH")
      attempt += 1
      print(f"Number of attempts: {attempt}")
      guess = int(input("Enter your guess: "))
   elif guess < random_number:
      print("TOO LOW")
      attempt += 1
      print(f"Number of attempts: {attempt}")
      guess = int(input("Enter your guess: "))
   else:
      break

print(f"You guessed the correct number: {random_number}!!")
print(f"Your total attempt/s: {attempt}")