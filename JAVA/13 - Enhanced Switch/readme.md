### 📁 13 - EnhancedSwitch

This exercise demonstrates how to use the **enhanced `switch` statement** in Java, which improves readability and reduces boilerplate code compared to the traditional `switch`.

---

### 📚 What I Learned

- The enhanced `switch` syntax (Java 14+):
  - Uses `->` instead of `:` and `break`
  - Supports multiple case labels separated by commas
- Helps simplify and clean up `switch` logic
- Allows better grouping of conditions like weekdays and weekends

---

### 🧠 Code Used

```java
package EnhancedSwitch.java;
import java.util.Scanner;

public class EnhancedSwitch {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      String day;
      
      System.out.print("Enter a weekday: ");
      day = scanner.nextLine();
      
      switch(day) {
         case "Monday", 
              "Tuesday",
              "Wednesday", 
              "Thursday", 
              "Friday" -> 
              System.out.println("It is a weekday");
              
         case "Saturday", 
              "Sunday" -> 
              System.out.println("It is a weekend");
              
         default -> 
              System.out.println(day + " is not a weekday");
      }
      
      scanner.close();
   }
}
