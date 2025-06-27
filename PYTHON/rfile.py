import time
file_path = input("Enter a file: ")

with open(file_path, 'r', encoding='utf-8-sig') as file:
   files = file.read()
   
   time.sleep(1)
   for line in files.splitlines():
      for char in line:
         time.sleep(0.08)
         print(char, end="", flush=True)
      print()
      time.sleep(0.4)

# WRITE FILE
# txt_data = input("Write here: ")
# file_path = "output.txt"
# 
# with open(file_path, "a") as file:
#    file.write("\n" + txt_data)
#    print("The text submitted")