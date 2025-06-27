import requests

url = "https://pokeapi.co/api/v2/"

pokename = input("Enter a pokemon: ")

def pokemon(name):
   new_url = f"{url}/pokemon/{name}"
   response = requests.get(new_url)
   
   if response.status_code == 200:
      pokemon_data = response.json()
      return pokemon_data
   else:
      print(f"Error {response.status_code}")

pokemon_info = pokemon(pokename)
if pokemon_info:
   print(f"Name: {pokemon_info["name"]}")
   print(f"Id: {pokemon_info["id"]}")
   print(f"Height: {pokemon_info["height"]}")
   print(f"Weight: {pokemon_info["weight"]}")
   
   print("Abilities: ")
   for ability in pokemon_info["abilities"]:
      print("  -", ability["ability"]["name"])
      
   print("Moves: ")
   for move in pokemon_info["moves"]:
      print("  -", move["move"]["name"])
      
   print("Stats: ")
   for stat in pokemon_info["stats"]:
      print(f"  - {stat["stat"]["name"]}: {stat["base_stat"]}")
    
   print("Types: ")
   for type in pokemon_info["types"]:
      print("  -", type["type"]["name"])
   