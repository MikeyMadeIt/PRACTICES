package LogicalOperator.java;

public class LogicalOperator{
   public static void main(String[] args){
      
      int average = 90;
      String choice = "q";
      String email = "michaelangelo.gmail.com";
      
      // && (AND)
      if(average >= 75 && average <= 100){
         System.out.println("You PASSED");
      }else if(average < 75){
         System.out.println("You FAILED");
      }else{
         System.out.println("Invalid Grade!");
      }
      
      // || (OR)
      if(choice.equals("q") || choice.equals("Q")){
         System.out.println("User want to Quit!");
      }else{
         System.out.println("Invalid Choice");
      }
      
      // ! (NOT)
      if(!email.contains("@")){
         System.out.println("This is not a valid email");
      }else{
         System.out.println("Error");
      }
      
   }
}
