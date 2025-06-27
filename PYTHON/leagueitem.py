import requests

url = "https://ddragon.leagueoflegends.com/cdn/15.13.1/data/en_US/item.json"
response = requests.get(url)

if response.status_code == 200:
    items = response.json()["data"]
    search = input("Enter item name or ID: ").strip()

    found = False

    # Check if search is an ID (only digits)
    if search.isdigit():
        if search in items:
            item = items[search]
            print(f"\n[Item Found by ID]")
            print(f"ID: {search}")
            print(f"Name: {item['name']}")
            print(f"Cost: {item['gold']['total']} gold")
            print(f"Description: {item['description']}")
            found = True
    else:
        # Search by name (partial or full, case-insensitive)
        for item_id, item in items.items():
            if search.lower() in item['name'].lower():
                print(f"\n[Item Found by Name]")
                print(f"ID: {item_id}")
                print(f"Name: {item['name']}")
                print(f"Cost: {item['gold']['total']} gold")
                print(f"Description: {item['description']}")
                found = True

    if not found:
        print(f"'{search}' not found.")
else:
    print("Error! Failed to fetch item data.")