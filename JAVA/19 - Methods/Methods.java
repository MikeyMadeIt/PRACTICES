public class Methods{
   public static void main(String[] args){
      
      Sing();
      System.out.println(pow(2));
      System.out.printf("Area: %,.2f", area(20));
      
   }
   static void Sing(){
      System.out.println("Happy Birthday to you!");
      System.out.println("Happy Birthday Michael!");
   }
   static int pow(int a){
      return a * a;
   }
   static double area(double r){
      return Math.PI * Math.pow(r, 2);
   }
}
