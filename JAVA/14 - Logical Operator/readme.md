### 📁 14 - LogicalOperator

This exercise demonstrates how to use **logical operators** in Java: `&&` (AND), `||` (OR), and `!` (NOT). These operators allow combining or inverting conditions when making decisions in code.

---

### 📚 What I Learned

- **`&&` (AND):** All conditions must be true for the block to execute.
- **`||` (OR):** At least one condition must be true.
- **`!` (NOT):** Reverses the result of a condition.
- How to use logical operators for:
  - Grade validation
  - Input handling (like quit options)
  - Basic email validation

---

### 🧠 Code Used

```java
package LogicalOperator.java;

public class LogicalOperator {
   public static void main(String[] args) {
      
      int average = 90;
      String choice = "q";
      String email = "michaelangelo.gmail.com";
      
      // && (AND)
      if (average >= 75 && average <= 100) {
         System.out.println("You PASSED");
      } else if (average < 75) {
         System.out.println("You FAILED");
      } else {
         System.out.println("Invalid Grade!");
      }
      
      // || (OR)
      if (choice.equals("q") || choice.equals("Q")) {
         System.out.println("User want to Quit!");
      } else {
         System.out.println("Invalid Choice");
      }
      
      // ! (NOT)
      if (!email.contains("@")) {
         System.out.println("This is not a valid email");
      } else {
         System.out.println("Error");
      }
   }
}
```

---

### 🚫 Logical Operator
| Operator | Name         | Description                                                  |
|----------|--------------|--------------------------------------------------------------|
| `&&`     | Logical AND  | True if **both** conditions are true                         |
| `¦¦`     | Logical OR   | True if **at least one** condition is true                   |
| `!`      | Logical NOT  | Reverses the result: true becomes false, false becomes true  |
