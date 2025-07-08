package IfStatement.java;

public class IfStatement{
   public static void main(String[] args){
      
      boolean isEnrolled = true;
      int age = 18;
      
      if(isEnrolled){
         System.out.println("You are enrolled!");
      }else{
         System.out.println("You are NOT enrolled!");
      }
      
      if(age >= 100){
         System.out.println("You are probably dead!");
      }
      else if(age >= 60){
         System.out.println("You are a Senior!");
      }
      else if(age >= 18){
         System.out.println("You are an Adult!");
      }
      else if(age < 18){
         System.out.println("You are a Minor!");
      }
      else if(age == 0){
         System.out.println("You has NOt been born yet!");
      }
      
   }
}