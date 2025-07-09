### 📁 06 - Random Number

This exercise demonstrates how to **generate random numbers** in Java using the `Random` class.

---

### 📚 What I Learned

- How to import and use the `java.util.Random` class
- How to generate a random integer within a range
- How to define and use a minimum and maximum limit
- Using `random.nextInt(min, max + 1)` to include both bounds

---

### 🧠 Code Used

```java
package RandomNumber.java;
import java.util.Random;

public class RandomNumber {
   public static void main(String[] args) {
      
      Random random = new Random();
      
      int min = 1;
      int max = 10;
      int number = random.nextInt(min, max + 1);
      
      System.out.println(number);
   }
} 
