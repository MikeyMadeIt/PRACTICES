### 📁 08 - PrintF

This exercise demonstrates how to use **`System.out.printf()`** in Java to print formatted output. It’s useful when you want better control over how text, numbers, and other values are displayed.

---

### 📚 What I Learned

- How to use `System.out.printf()` for formatted output
- Common format specifiers:
  - `%s` → for strings
  - `%d` → for integers
  - `%f` → for floating point numbers
  - `%c` → for characters
  - `%b` → for booleans
  - `\n` → for printing new line
  - `%.2f` → for decimal precision
  - `%04d` → for padding integers with leading zeros
- How to control **decimal precision** and **line breaks**

---

### 🧠 Code Used

```java
package PrintF.java;

public class PrintF {
   public static void main(String[] args) {
      
      String name = "Michael Angelo";
      int age = 18;
      double price = 20.3762;
      char letter = 'A';
      boolean isEnrolled = true;
      
      System.out.printf("My name is: %s \n", name);
      System.out.printf("My age is: %d \n", age);
      System.out.printf("The price is: %.2f \n", price);
      System.out.printf("My letter grade is: %c \n", letter);
      System.out.printf("I'm enrolled: %b \n", isEnrolled);
   }
}
