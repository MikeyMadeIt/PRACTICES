public class OverloadMethods{
   public static void main(String[] args){
      
      System.out.println(add(1, 3));
      
   }
   static int add(int a, int b){
      return a + b;
   }
   static int add(int a, int b, int c){
      return a + b + c;
   }
}
