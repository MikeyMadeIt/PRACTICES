### 📁 12 - TernaryOperator

This exercise demonstrates how to use the **ternary operator (`?:`)** in Java as a compact alternative to `if-else` statements for simple conditional checks.

---

### 📚 What I Learned

- The ternary operator allows assigning values based on a condition in a single line.
- Useful for shortening simple `if-else` statements.
- Syntax format:
  ```java
  variable = (condition) ? valueIfTrue : valueIfFalse;
  ```

---

### 🧠 Code Used

```java
package TernaryOperator.java;

public class TernaryOperator{
   public static void main(String[] args){
      
      int score = 45;
      float temperature = 26.8F;
      int time = 10;
      
      String PassOrFailed = (score <= 30) ? "FAIL" : "PASS";
      String HotOrCold = (temperature <= 25) ? "COLD" : "HOT";
      String AmOrPm = (time < 12) ? "A.M." : "P.M.";
      
      System.out.println(PassOrFailed);
      System.out.println(HotOrCold);
      System.out.println(AmOrPm);
      
   }
}
```
