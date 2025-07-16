public class VarArgs{
   public static void main(String[] args){
      
      double output;
      int addOutput;
      output = average(78, 90, 98, 99, 97, 96, 95, 93);
      addOutput = add(27, 20, 78, 76, 100);
      
      System.out.printf("Average: %,.2f\n", output);
      System.out.printf("Sum: %d\n", addOutput);
      
   }
   static double average(double... nums){
      double sum = 0, average = 0;
      for(double num : nums){
         sum += num;
      }
      
      average = sum / nums.length;
      return average;
   }
   static int add(int... nums){
      int sum = 0;
      for(int num : nums){
         sum += num;
      }
      
      return sum;
   }
}
