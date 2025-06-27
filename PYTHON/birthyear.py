import datetime
current_year = datetime.datetime.now().year

user_year = int(input("Enter your birthyear: "))

age = current_year - user_year
print(f"Your age is {age}")