rows = int(input("Enter the # of rows: "))
cols = int(input("Enter the # of cols: "))
symbols = input("Enter a symbol to use: ")

for x in range(rows):
   for y in range(cols):
      print(symbols, end="")
   print()