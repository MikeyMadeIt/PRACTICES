import requests

url = "https://ddragon.leagueoflegends.com/cdn/15.13.1/data/en_US/champion.json"

response = requests.get(url)

if response.status_code == 200:
   data = response.json()["data"]
   
   search = input("Enter champion's name: ").capitalize()
   
   if search in data:
      champ = data[search]
      print(f"Version: {champ["version"]}")
      print(f"Id: {champ["id"]}")
      print(f"Key: {champ["key"]}")
      print()
      print(f"Name: {champ["name"]}")
      print(f"Title: {champ["title"]}")
      print(f"Roles: {", ".join(champ["tags"])} ")
      print(f"Type: {champ["partype"]}")
      print()
      print(f"Blurb: {champ["blurb"]}")
      print()
      print("Info: ")
      for key, values in champ["info"].items():
         print(f"   - {key}: {values}")
      print()
      print("Stats: ")
      for key, values in champ["stats"].items():
         print(f"   - {key}: {values}")
         
   elif search not in data:
      print(f"'{search}' was not in the data list")
   
   else:
      print("Error")