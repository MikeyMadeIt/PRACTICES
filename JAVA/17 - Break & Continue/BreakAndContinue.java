import java.util.Arrays;

public class BreakAndContinue{
   public static void main(String[] args){
      
      String[] names = {"Michael",
                        "Angelo",
                        "Ricamata",
                        "Tung Sahur",
                        "Crocodilo"};
      
      for(String name1 : names){
         if(name1.equals("Ricamata")){
            break;
         }
         System.out.print(name1 + ", ");
      }
      
      System.out.println("");
      
      for(String name2 : names){
         if(name2.equals("Ricamata")){
            continue;
         }
         System.out.print(name2 + ", ");
      }
      
   }
} 
