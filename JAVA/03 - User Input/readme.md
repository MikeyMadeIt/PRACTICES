### 📁 03 - UserInput

This exercise introduces **user input in Java** using the `Scanner` class. It asks the user for their name and age, then prints a personalized message.

---

### 📚 What I Learned

- How to import and use the `Scanner` class from `java.util`
- How to take **String input** using `nextLine()`
- How to take **integer input** using `nextInt()`
- How to combine user input with output using **string concatenation**
- The difference between `nextLine()` and `nextInt()`

---

### 🧠 Code Used

```java
package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
       
        Scanner getUserInput = new Scanner(System.in);
        
        System.out.print("Name: ");
        String getUserName = getUserInput.nextLine();
        
        System.out.print("Age: ");
        int getUserAge = getUserInput.nextInt();
        
        System.out.println("Your name is " + getUserName + " and you are " + getUserAge + " years old");
    }
} 
