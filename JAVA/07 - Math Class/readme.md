### 📁 07 - Math Class

This exercise explores the **Java Math class**, which provides built-in methods for mathematical operations like rounding, exponentials, square roots, trigonometry, and constants.

---

### 📚 What I Learned

- How to use the `Math` class in Java for:
  - Constants (`Math.PI`, `Math.E`)
  - Basic operations: `abs()`, `min()`, `max()`, `round()`, `ceil()`, `floor()`
  - Exponents and logarithms: `pow()`, `sqrt()`, `exp()`, `log()`
  - Trigonometry: `sin()`, `cos()`, `tan()`, `toRadians()`, `toDegrees()`
- The importance of converting between **degrees and radians** when using trigonometric functions

---

### 🧠 Code Used

```java
package MathClass.java;

public class MathClass {
   public static void main(String[] args) {
      
      int degrees, min, max, abs, a, b, c;
      double radians, d, e, f, g, h, i, j, k, l, m, n, o, p;
      min = 2;
      max = 5;
      radians = Math.toRadians(90);
      degrees = 45;
      abs = -6;
      double num = 25.25;
      
      // CONSTANTS
      double PI = Math.PI;
      double E = Math.E;
      
      // BASIC OPERATIONS
      a = Math.abs(abs);
      b = Math.max(min, max);
      c = Math.min(min, max);
      d = Math.round(num);
      e = Math.ceil(num);
      f = Math.floor(num);
      
      // EXPONENTS AND LOGARITHMS
      g = Math.pow(num, 2);
      h = Math.sqrt(num);
      i = Math.exp(num);
      j = Math.log(num);
      
      // TRIGONOMETRIC FUNCTIONS
      l = Math.sin(radians);
      m = Math.cos(radians);
      n = Math.tan(radians);
      o = Math.toDegrees(radians);
      p = Math.toRadians(degrees);
   }
}
```

---

| Method                | Description                              |
|-----------------------|------------------------------------------|
| `Math.abs(x)`         | Returns the absolute value of `x`        |
| `Math.max(a, b)`      | Returns the larger of two values         |
| `Math.min(a, b)`      | Returns the smaller of two values        |
| `Math.round(x)`       | Rounds to the nearest whole number       |
| `Math.ceil(x)`        | Rounds up to the nearest whole           |
| `Math.floor(x)`       | Rounds down to the nearest whole         |
| `Math.pow(x, y)`      | Returns `x` raised to the power `y`      |
| `Math.sqrt(x)`        | Returns the square root of `x`           |
| `Math.exp(x)`         | Returns `e^x`                            |
| `Math.log(x)`         | Returns natural log (ln) of `x`          |
| `Math.sin(radians)`   | Returns sine of angle in radians         |
| `Math.cos(radians)`   | Returns cosine of angle in radians       |
| `Math.tan(radians)`   | Returns tangent of angle in radians      |
| `Math.toRadians(deg)` | Converts degrees to radians              |
| `Math.toDegrees(rad)` | Converts radians to degrees              |
| `Math.PI`             | Constant π (approx. 3.14159)             |
| `Math.E`              | Constant e (approx. 2.71828)             |
