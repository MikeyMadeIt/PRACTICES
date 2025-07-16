public class TwoDArray{
   public static void main(String[] args){
      
      double sum1 = 0, sum2 = 0, sum3 = 0;
      
      int[] student1 = {90, 97, 96};
      int[] student2 = {90, 87, 92};
      int[] student3 = {84, 88, 93};
      
      int[][] array = {student1, student2, student3};
      
      System.out.println("Grades: ");
      System.out.print("Student 1: ");
      for(int i = 0; i < array[0].length; i++){
         System.out.print(array[0][i] + ", ");
      }
      System.out.println("");
      
      System.out.print("Student 2: ");
      for(int i = 0; i < array[1].length; i++){
         System.out.print(array[1][i] + ", ");
      }
      System.out.println("");
      
      System.out.print("Student 3: ");
      for(int i = 0; i < array[2].length; i++){
         System.out.print(array[2][i] + ", ");
      }
      System.out.println("");
      System.out.println("");
      
      System.out.println("Averages: ");
      System.out.print("Student 1: ");
      for(int i = 0; i < array[0].length; i++){
         sum1 += array[0][i];
      }
      double average1 = sum1 / array[0].length;
      System.out.printf("%,.2f\n", average1);
      
      System.out.print("Student 2: ");
      for(int i = 0; i < array[1].length; i++){
         sum2 += array[1][i];
      }
      double average2 = sum2 / array[1].length;
      System.out.printf("%,.2f\n", average2);
      
      System.out.print("Student 3: ");
      for(int i = 0; i < array[2].length; i++){
         sum3 += array[2][i];
      }
      double average3 = sum3 / array[2].length;
      System.out.printf("%,.2f\n", average3);
      
   }
}
