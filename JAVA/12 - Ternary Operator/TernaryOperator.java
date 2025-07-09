package TernaryOperator.java;

public class TernaryOperator{
   public static void main(String[] args){
      
      int score = 45;
      float temperature = 26.8F;
      int time = 10;
      
      String PassOrFailed = (score <= 30) ? "FAIL" : "PASS";
      String HotOrCold = (temperature <= 25) ? "COLD" : "HOT";
      String AmOrPm = (time < 12) ? "A.M." : "P.M.";
      
      System.out.println(PassOrFailed);
      System.out.println(HotOrCold);
      System.out.println(AmOrPm);
      
   }
}
