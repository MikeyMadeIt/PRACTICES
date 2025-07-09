### 📁 10 - StringMethod

This exercise demonstrates the use of **common String methods** in Java, including checking length, case conversion, trimming, replacing characters, and comparing strings.

---

### 📚 What I Learned

- How to use Java String methods like:
  - `length()`, `charAt()`, `indexOf()`, `lastIndexOf()`
  - `toUpperCase()`, `toLowerCase()`, `trim()`, `replace()`
  - `isEmpty()`, `contains()`, `equals()`, `equalsIgnoreCase()`
- How to check string values and compare them properly
- Trimming whitespace and checking for empty strings

---

### 🧠 Code Used

```java
package StringMethod.java;

public class StringMethod {
   public static void main(String[] args) {
      
      String name1, name2, name3, name4;
      String name = "  Michael Angelo  ";
      
      int length = name.length();
      char letter = name.charAt(2);
      int index = name.indexOf("M");
      int lastIndex = name.lastIndexOf("o");
      
      System.out.println(length);
      System.out.println(letter);
      System.out.println(index);
      System.out.println(lastIndex);
      
      name1 = name.toUpperCase();
      name2 = name.toLowerCase();
      name3 = name.trim();
      name4 = name.replace("o", "a");
      
      System.out.println(name1);
      System.out.println(name2);
      System.out.println(name3);
      System.out.println(name4);
      
      if(name.isEmpty()){
         System.out.println("Your name is Empty");
      } else {
         System.out.println("Your name ISN'T Empty");
      }
      
      if(name.contains(" ")){
         System.out.println("Your name contain spaces");
      } else {
         System.out.println("Your name DOESN'T contain any spaces");
      }
      
      if(name.equals("password")){
         System.out.println("Your name cannot be password");
      } else {
         System.out.println("Hello, " +  name);
      }
      
      if(name.equalsIgnoreCase("password")){
         System.out.println("Your name cannot be password");
      } else {
         System.out.println("Hello, " +  name);
      }
   }
}
```

---

### 🧵 String Methods
| Method                  | Description                                        |
|-------------------------|----------------------------------------------------|
| `length()`              | Returns the length of the string                   |
| `charAt(index)`         | Returns the character at a specific index          |
| `indexOf(char/str)`     | Returns the first index of a character/string      |
| `lastIndexOf(char/str)` | Returns the last index of a character/string       |
| `toUpperCase()`         | Converts all characters to uppercase               |
| `toLowerCase()`         | Converts all characters to lowercase               |
| `trim()`                | Removes leading and trailing spaces                |
| `replace(old, new)`     | Replaces all instances of a character              |
| `isEmpty()`             | Checks if the string is empty                      |
| `contains(str)`         | Checks if string contains the given substring      |
| `equals(str)`           | Checks if strings match exactly (case-sensitive)   |
| `equalsIgnoreCase(str)` | Compares strings ignoring case                     | 
