import requests

url = "https://official-joke-api.appspot.com/jokes/random/"
num = input("Enter a number: ")

def thejokes(num):
   new_url = f"{url}{num}"
   response = requests.get(new_url)
   
   if response.status_code == 200:
      jokes = response.json()
      return jokes
   else:
      print(f"Error {response.status_code}")

joke = thejokes(num)
if joke:
   for j in joke:
      print(f"Type: {j["type"]}")
      print(f"Setup: {j["setup"]}")
      print(f"Punchline: {j["punchline"]}")
      print(f"Id: {j["id"]}")
      print()
else:
   print("Error")