### 📁 04 - Arithmetic

This exercise covers **basic arithmetic operations** in Java using integers. It performs calculations using two numbers and displays the results.

---

### 📚 What I Learned

- How to use arithmetic operators in Java:
  - `+` Addition  
  - `-` Subtraction  
  - `*` Multiplication  
  - `/` Division  
  - `%` Modulo (Remainder)
- How to store the results in variables
- How to display multiple outputs with `System.out.println()`

---

### 🧠 Code Used

```java
package Arithmetic.java;

public class Arithmetic {
   public static void main(String[] args) {
      
      int a, b, result1, result2, result3, result4, result5;
      a = 20;
      b = 10;
      
      // ADDITION
      result1 = a + b;
      
      // MULTIPLICATION
      result2 = a * b;
      
      // SUBTRACTION
      result3 = a - b;
      
      // DIVISION
      result4 = a / b;
      
      // MODULO
      result5 = a % b;
      
      System.out.println("Addition: " + result1);
      System.out.println("Multiplication: " + result2);
      System.out.println("Subtraction: " + result3);
      System.out.println("Division: " + result4);
      System.out.println("Modulo: " + result5);
   }
} 
