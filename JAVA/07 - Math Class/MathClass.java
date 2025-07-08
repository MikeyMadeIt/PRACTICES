package MathClass.java;

public class MathClass{
   public static void main(String[] args){
      
      int degrees, min, max, abs, a, b, c;
      double radians, d, e, f, g, h, i, j, k, l, m, n, o, p;
      min = 2;
      max = 5;
      radians = Math.toRadians(90);
      degrees = 45;
      abs = -6; // for Math.abs()
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
      l = Math.sin(radians); // angle in radians
      m = Math.cos(radians); // angle in radians
      n = Math.tan(radians); // angle in radians
      o = Math.toDegrees(radians);
      p = Math.toRadians(degrees);

   }
}