### 📁 09 - NestedIf

This exercise demonstrates how to use **nested `if` statements** in Java — where one `if` is placed inside another. This is useful for checking multiple levels of conditions.

---

### 📚 What I Learned

- How to use **nested `if` statements**
- How to apply multiple conditions (e.g., student **and** senior)
- How to adjust values like `price` based on logic
- The importance of logical flow and structure for readable decisions

---

### 🧠 Code Used

```java
package NestedIf.java;

public class NestedIf {
   public static void main(String[] args) {
      
      boolean isStudent = true;
      boolean isSenior = true;
      double price = 9.99;
      
      if(isStudent){
         if(isSenior){
            System.out.println("You get a Student Discount of 10%");
            System.out.println("You get a Student Discount of 20%");
            price *= 0.7;
         } else {
            System.out.println("You get a Student Discount of 10%");
            price *= 0.9;
         }
      } else {
         if(isSenior){
            System.out.println("You get a Student Discount of 20%");
            price *= 0.8;
         } else {
            price *= 1;
         }
      }
   }
}
