### 📁 11 - SubStrings

This exercise demonstrates how to use the **`substring()`** method in Java to extract parts of a string, such as a username and domain from an email.

---

### 📚 What I Learned

- How to use `substring(startIndex, endIndex)` and `substring(startIndex)`
- How to extract specific parts of a string using `indexOf()` and `substring()`
- Basic input validation using `contains()`
- How to handle and split an email into:
  - **Username** → before the `@`
  - **Domain** → after the `@`

---

### 🧠 Code Used

```java
package SubStrings.java;
import java.util.Scanner;

public class SubStrings {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      String email, username, domain;
      
      System.out.print("Enter your email: ");
      email = scanner.nextLine();
      if (!email.contains("@")) {
         System.out.print("This is not a valid email!");
         scanner.close();
         return;
      }
      
      username = email.substring(0, email.indexOf("@"));
      domain = email.substring(email.indexOf("@") + 1);
      
      System.out.println("Username: " + username);
      System.out.println("Domain: " + domain);
      
      scanner.close();
   }
}
```

---

### 🧵 Sub Strings 
| Method                  | Description                                           |
|-------------------------|-------------------------------------------------------|
| `substring(start)`      | Returns substring from the given index to end         |
| `substring(start, end)` | Returns substring from start index to end - 1         |
| `indexOf(char/str)`     | Returns the index of the first occurrence             |
| `contains(str)`         | Checks if a substring exists in the main string       |
