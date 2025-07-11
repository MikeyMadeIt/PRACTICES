package WeightConverter.java;

import java.util.*;
import java.util.Scanner;

public class WeightConverter{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      String firstChoice;
      String secondChoice;
      double weight;
      double kilogram1, kilogram2, kilogram3, kilogram4, kilogram5;
      double ounce1, ounce2, ounce3, ounce4, ounce5;
      double pound1, pound2, pound3, pound4, pound5;
      double ton1, ton2, ton3, ton4, ton5;
      double miligram1, miligram2, miligram3, miligram4, miligram5;
      double gram1, gram2, gram3, gram4, gram5;
      
      System.out.println("WEIGHT CONVERTER 1.0");
      
      System.out.println("");
      System.out.println("How it's work?");
      System.out.println("1. Enter the current unit of weight.");
      System.out.println("2. Enter the unit you want to convert to.");
      System.out.println("3. Enter the weight value.");
      System.out.println("");
      
      System.out.println("———————————");
      System.out.println("");
      
      System.out.print("Enter the current weight unit: ");
      firstChoice = scanner.nextLine().trim();
      
      System.out.print("Enter the unit to convert to: ");
      secondChoice = scanner.nextLine().trim();
      
      System.out.print("Enter a weight: ");
      if(!scanner.hasNextDouble()){
         System.out.println("Invalid input: please enter a numeric value.");
         scanner.close();
         return;
      }
      weight = scanner.nextDouble();
      
      // KILOGRAM
      kilogram1 = weight / 0.453592; // kg to lb
      kilogram2 = weight * 35.274; // kg to oz
      kilogram3 = weight / 1_000; // kg to ton
      kilogram4 = weight * 1_000_000; // kg to mg
      kilogram5 = weight * 1_000; // kg to g
      
      // POUND
      pound1 = weight * 0.453592; // lb to kg
      pound2 = weight * 16; // lb to oz
      pound3 = weight * 0.000453592; // lb to ton
      pound4 = weight * 453_592.37; // lb to mg
      pound5 = weight * 453.592; // lb to g
      
      // OUNCE
      ounce1 = weight / 16; // oz to lb
      ounce2 = weight * 0.0283495; // oz to kg
      ounce3 = weight * 0.0000283495; // oz to ton
      ounce4 = weight * 28_349.5; // oz to mg
      ounce5 = weight * 28.3495; // oz to g 
      
      // METRIC TONNE
      ton1 = weight * 1_000; // ton to kg
      ton2 = weight * 2_204.62; // ton to lb
      ton3 = weight * 35_274; // ton to oz
      ton4 = weight * 1_000_000_000; // ton to mg
      ton5 = weight * 1_000_000; // ton to g
      
      // MILIGRAM
      miligram1 = weight / 1_000_000; // mg to kg
      miligram2 = weight / 453_592.37; // mg to lb
      miligram3 = weight / 28_349.5; // mg to oz
      miligram4 = weight / 1_000_000_000; // mg to ton
      miligram5 = weight / 1_000; // mg to g
      
      // GRAM
      gram1 = weight / 1_000; // g to kg
      gram2 = weight / 453.59237; // g to lb
      gram3 = weight / 28.3495; // g to oz 
      gram4 = weight / 1_000_000; // g to ton
      gram5 = weight * 1_000; // g to mg
      
      // FIRSTCHOICE = KILOGRAM
      
      System.out.println("");
      
      if(firstChoice.equalsIgnoreCase("kilogram") ||
      firstChoice.equalsIgnoreCase("kg")){
         if(secondChoice.equalsIgnoreCase("kilogram") ||
         secondChoice.equalsIgnoreCase("kg")){
            System.out.printf("Kilogram to Kilogram = %,.2fkg \n", weight);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("pound") ||
         secondChoice.equalsIgnoreCase("lb")){
            System.out.printf("Kilogram to Pounds = %,.2fkg \n", kilogram1);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("ounce") ||
         secondChoice.equalsIgnoreCase("oz")){
            System.out.printf("Kilogram to Ounce = %,.2foz \n", kilogram2);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("metric tonne") ||
         secondChoice.equalsIgnoreCase("ton")){
            System.out.printf("Kilogram to Metric Tonne = %,.2ft", kilogram3);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("miligram") ||
         secondChoice.equalsIgnoreCase("mg")){
            System.out.printf("Kilogram to Miligram = %,.2fmg", kilogram4);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("gram") ||
         secondChoice.equalsIgnoreCase("g")){
            System.out.printf("Kilogram to Gram = %,.2fg", kilogram5);
            scanner.close();
            return;
         }
         else{
            System.out.println("Invalid input: please enter a unit of weight measurement.");
            scanner.close();
            return;
         }
      }
      
      // FIRSTCHOICE = POUND
      
      else if(firstChoice.equalsIgnoreCase("pound") ||
      firstChoice.equalsIgnoreCase("lb")){
         if(secondChoice.equalsIgnoreCase("pound") ||
         secondChoice.equalsIgnoreCase("lb")){
            System.out.printf("Pound to Pound = %,.2flb \n", weight);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("kilogram") ||
         secondChoice.equalsIgnoreCase("kg")){
            System.out.printf("Pound to Kilogram = %,.2flb \n", pound1);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("ounce") ||
         secondChoice.equalsIgnoreCase("oz")){
            System.out.printf("Pound to Ounce = %,.2foz \n", pound2);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("metric tonne") ||
         secondChoice.equalsIgnoreCase("ton")){
            System.out.printf("Pound to Metric Tonne = %,.2ft", pound3);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("miligram") ||
         secondChoice.equalsIgnoreCase("mg")){
            System.out.printf("Pound to Miligram = %,.2fmg", pound4);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("gram") ||
         secondChoice.equalsIgnoreCase("g")){
            System.out.printf("Pound to Gram = %,.2fg", pound5);
            scanner.close();
            return;
         }
         else{
            System.out.println("Invalid input: please enter a unit of weight measurement.");
            scanner.close();
            return;
         }
      }
      
      // FIRSTCHOICE = OUNCE
      
      else if(firstChoice.equalsIgnoreCase("ounce") ||
      firstChoice.equalsIgnoreCase("oz")){
         if(secondChoice.equalsIgnoreCase("ounce") ||
         secondChoice.equalsIgnoreCase("oz")){
            System.out.printf("Ounce to Ounce = %,.2foz \n", weight);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("pound") ||
         secondChoice.equalsIgnoreCase("lb")){
            System.out.printf("Ounce to Pound = %,.2flb", ounce1);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("kilogram") ||
         secondChoice.equalsIgnoreCase("kg")){
            System.out.printf("Ounce to Kilogram = %,.2fkg", ounce2);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("metric tonne") ||
         secondChoice.equalsIgnoreCase("ton")){
            System.out.printf("Ounce to Metric Tonne = %,.2fton", ounce3);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("miligram") ||
         secondChoice.equalsIgnoreCase("mg")){
            System.out.printf("Ounce to Miligram = %,.2fmg", ounce4);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("gram") ||
         secondChoice.equalsIgnoreCase("g")){
            System.out.printf("Ounce to Gram = %,.2fg", ounce5);
            scanner.close();
            return;
         }
         else{
            System.out.println("Invalid input: please enter a unit of weight measurement.");
            scanner.close();
            return;
         }
      }
      
      // FIRSTCHOICE = METRIC TONNE
      
      else if(firstChoice.equalsIgnoreCase("metric tonne") ||
      firstChoice.equalsIgnoreCase("ton")){
         if(secondChoice.equalsIgnoreCase("metric tonne") ||
         secondChoice.equalsIgnoreCase("ton")){
            System.out.printf("Metric Tonne to Metric Tonne = %,.2fton \n", weight);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("kilogram") ||
         secondChoice.equalsIgnoreCase("kg")){
            System.out.printf("Metric Tonne to Kilogram = %,.2fkg", ton1);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("pound") ||
         secondChoice.equalsIgnoreCase("lb")){
            System.out.printf("Metric Tonne to Pound = %,.2flb", ton2);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("ounce") ||
         secondChoice.equalsIgnoreCase("oz")){
            System.out.printf("Metric Tonne to Ounce = %,.2foz", ton3);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("miligram") ||
         secondChoice.equalsIgnoreCase("mg")){
            System.out.printf("Metric Tonne to Miligram = %,.2fmg", ton4);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("gram") ||
         secondChoice.equalsIgnoreCase("g")){
            System.out.printf("Metric Tonne to Gram = %,.2fg", ton5);
            scanner.close();
            return;
         }
         else{
            System.out.println("Invalid input: please enter a unit of weight measurement.");
            scanner.close();
            return;
         }
      }
      
      // FIRSTCHOICE = MILIGRAM
      
      else if(firstChoice.equalsIgnoreCase("miligram") ||
      firstChoice.equalsIgnoreCase("mg")){
         if(secondChoice.equalsIgnoreCase("miligram") ||
         secondChoice.equalsIgnoreCase("mg")){
            System.out.printf("Miligram to Miligram = %,.2fmg \n", weight);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("kilogram") ||
         secondChoice.equalsIgnoreCase("kg")){
            System.out.printf("Miligram to Kilogram = %,.2fkg", miligram1);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("pound") ||
         secondChoice.equalsIgnoreCase("lb")){
            System.out.printf("Miligram to Pound = %,.2flb", miligram2);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("ounce") ||
         secondChoice.equalsIgnoreCase("oz")){
            System.out.printf("Miligram to Ounce = %,.2foz", miligram3);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("metric tonne") ||
         secondChoice.equalsIgnoreCase("ton")){
            System.out.printf("Miligram to Metric Tonne = %,.2fton", miligram4);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("gram") ||
         secondChoice.equalsIgnoreCase("g")){
            System.out.printf("Miligram to Gram = %,.2fg", miligram5);
            scanner.close();
            return;
         }
         else{
            System.out.println("Invalid input: please enter a unit of weight measurement.");
            scanner.close();
            return;
         }
      }
      
      // FIRSTCHOICE = GRAM
      
      else if(firstChoice.equalsIgnoreCase("gram") ||
      firstChoice.equalsIgnoreCase("g")){
         if(secondChoice.equalsIgnoreCase("gram") ||
         secondChoice.equalsIgnoreCase("g")){
            System.out.printf("Gram to Gram = %,.2fg \n", weight);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("kilogram") ||
         secondChoice.equalsIgnoreCase("kg")){
            System.out.printf("Gram to Kilogram = %,.2fkg", gram1);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("pound") ||
         secondChoice.equalsIgnoreCase("lb")){
            System.out.printf("Gram to Pound = %,.2flb", gram2);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("ounce") ||
         secondChoice.equalsIgnoreCase("oz")){
            System.out.printf("Gram to Ounce = %,.2foz", gram3);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("metric tonne") ||
         secondChoice.equalsIgnoreCase("ton")){
            System.out.printf("Gram to Metric Tonne = %,.2fton", gram4);
            scanner.close();
            return;
         }
         else if(secondChoice.equalsIgnoreCase("miligram") ||
         secondChoice.equalsIgnoreCase("mg")){
            System.out.printf("Gram to Miligram = %,.2fmg", gram5);
            scanner.close();
            return;
         }
         else{
            System.out.println("Invalid input: please enter a unit of weight measurement.");
            scanner.close();
            return;
         }
      }
      
      else{
         System.out.println("Invalid input: please enter a unit of weight measurement.");
      }
      
      scanner.close();
   }
}