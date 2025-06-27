package EveryMonthSymbol.java;

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class EveryMonthSymbol{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      String userMonth;
      int userDayOfMonth;
      Integer[] January1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
      Integer[] January2 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] Febraury1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
      Integer[] Febraury2 = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
      Integer[] March1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
      Integer[] March2 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] April1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
      Integer[] April2 = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] May1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
      Integer[] May2 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] June1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
      Integer[] June2 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] July1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
      Integer[] July2 = {23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] August1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
      Integer[] August2 = {23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] September1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
      Integer[] September2 = {23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] October1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
      Integer[] October2 = {23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] November1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
      Integer[] November2 = {22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
      Integer[] December1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
      Integer[] December2 = {22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
      
      System.out.print("Enter your month: ");
      userMonth = scanner.nextLine().trim();
      if(!userMonth.matches("[a-zA-Z]+")){
         System.out.println("Invalid");
         scanner.close();
         return;
      }
      
      System.out.print("Enter your day of birth: ");
      if(!scanner.hasNextInt()){
         System.out.println("Invalid");
         scanner.close();
         return;
      }
      userDayOfMonth = scanner.nextInt();
      
      System.out.println("");
      
      if(userMonth.equalsIgnoreCase("january")){
         if(Arrays.asList(January1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Capricorn");
            System.out.println("Birthstone: Garnet (Symbolizes protection)");
            System.out.println("Birth Flower: Carnation or Snowdrop");
            System.out.println("Symbolism: New beginning, determination and resilience");
         }
         else if(Arrays.asList(January2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Apricot");
            System.out.println("Birthstone: Garnet (Symbolizes protection)");
            System.out.println("Birth Flower: Carnation or Snowdrop");
            System.out.println("Symbolism: New beginning, determination and resilience");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("febraury")){
         if(Arrays.asList(Febraury1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Aquarius");
            System.out.println("Birthstone: Amethyst (Symbolizes peace and clarity)");
            System.out.println("Birth Flower: Violet or Primrose");
            System.out.println("Symbolism: Love, Vision and Creativity");
         }
         else if(Arrays.asList(Febraury2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Pisces");
            System.out.println("Birthstone: Amethyst (Symbolizes peace and clarity)");
            System.out.println("Birth Flower: Violet or Primrose");
            System.out.println("Symbolism: Love, Vision and Creativity");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("march")){
         if(Arrays.asList(March1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Pisces");
            System.out.println("Birthstone: Aquamarine (Symbolizes courage and calm)");
            System.out.println("Birth Flower: Daffodil");
            System.out.println("Symbolism: Rebirth, Intuition, and Growth");
         }
         else if(Arrays.asList(March2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Aries");
            System.out.println("Birthstone: Aquamarine (Symbolizes courage and calm)");
            System.out.println("Birth Flower: Daffodil");
            System.out.println("Symbolism: Rebirth, Intuition, and Growth");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("april")){
         if(Arrays.asList(April1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Aries");
            System.out.println("Birthstone: Diamond (Symbolizes strength and purity)");
            System.out.println("Birth Flower: Daisy or Sweet Pea");
            System.out.println("Symbolism: Courage, Passion and Renewal");
         }
         else if(Arrays.asList(April2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Taurus");
            System.out.println("Birthstone: Diamond (Symbolizes strength and purity)");
            System.out.println("Birth Flower: Daisy or Sweet Pea");
            System.out.println("Symbolism: Courage, Passion and Renewal");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("may")){
         if(Arrays.asList(May1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Taurus");
            System.out.println("Birthstone: Emerald (Symbolizes love and fertility)");
            System.out.println("Birth Flower: Lily of the Valley or Hawthorn");
            System.out.println("Symbolism: Growth, Prosperity, and Love");
         }
         else if(Arrays.asList(May2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Gemini");
            System.out.println("Birthstone: Emerald (Symbolizes love and fertility)");
            System.out.println("Birth Flower: Lily of the Valley or Hawthorn");
            System.out.println("Symbolism: Growth, Prosperity, and Love");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("june")){
         if(Arrays.asList(June1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Gemini");
            System.out.println("Birthstone: Pearl, Alexandrite, Moonstone (Symbolizes purity and intuition)");
            System.out.println("Birth Flower: Rose or Honeysuckle");
            System.out.println("Symbolism: Emotion, Light and Nurturing");
         }
         else if(Arrays.asList(June2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Cancer");
            System.out.println("Birthstone: Pearl, Alexandrite, Moonstone (Symbolizes purity and intuition)");
            System.out.println("Birth Flower: Rose or Honeysuckle");
            System.out.println("Symbolism: Emotion, Light and Nurturing");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("july")){
         if(Arrays.asList(July1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Cancer");
            System.out.println("Birthstone: Ruby (Symbolizes passion and vitality)");
            System.out.println("Birth Flower: Larkspur or Water Lily");
            System.out.println("Symbolism: Loyalty, Strength and Affection");
         }
         else if(Arrays.asList(July2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Leo");
            System.out.println("Birthstone: Ruby (Symbolizes passion and vitality)");
            System.out.println("Birth Flower: Larkspur or Water Lily");
            System.out.println("Symbolism: Loyalty, Strength and Affection");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("august")){
         if(Arrays.asList(August1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Leo");
            System.out.println("Birthstone: Peridot (Symbolizes Protection and success)");
            System.out.println("Birth Flower: Gladiolus or Poppy");
            System.out.println("Symbolism: Confidence, Warmth or Abundance");
         }
         else if(Arrays.asList(August2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Virgo");
            System.out.println("Birthstone: Peridot (Symbolizes Protection and success)");
            System.out.println("Birth Flower: Gladiolus or Poppy");
            System.out.println("Symbolism: Confidence, Warmth or Abundance");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("september")){
         if(Arrays.asList(September1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Virgo");
            System.out.println("Birthstone: Sapphire (Symbolizes Wisdom and Truth)");
            System.out.println("Birth Flower: Aster or Morning Glory");
            System.out.println("Symbolism: Reflection, Balance and Knowledge");
         }
         else if(Arrays.asList(September2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Libra");
            System.out.println("Birthstone: Sapphire (Symbolizes Wisdom and Truth)");
            System.out.println("Birth Flower: Aster or Morning Glory");
            System.out.println("Symbolism: Reflection, Balance and Knowledge");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("october")){
         if(Arrays.asList(October1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Libra");
            System.out.println("Birthstone: Opal or Tourmaline (Symbolizes hope and creativity)");
            System.out.println("Birth Flower: Marigold or Cosmos");
            System.out.println("Symbolism: Mystery, Change, and Depth");
         }
         else if(Arrays.asList(October2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Scorpio");
            System.out.println("Birthstone: Opal or Tourmaline (Symbolizes hope and creativity)");
            System.out.println("Birth Flower: Marigold or Cosmos");
            System.out.println("Symbolism: Mystery, Change, and Depth");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("november")){
         if(Arrays.asList(November1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Scorpio");
            System.out.println("Birthstone: Topaz or Citrine (Symbolizes Warmth and Abundance)");
            System.out.println("Birth Flower: Chrysanthemum");
            System.out.println("Symbolism: Strength, Gratitude, and Transition");
         }
         else if(Arrays.asList(November2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Sagittarius");
            System.out.println("Birthstone: Topaz or Citrine (Symbolizes Warmth and Abundance)");
            System.out.println("Birth Flower: Chrysanthemum");
            System.out.println("Symbolism: Strength, Gratitude, and Transition");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else if(userMonth.equalsIgnoreCase("december")){
         if(Arrays.asList(December1).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Sagittarius");
            System.out.println("Birthstone: Turquoise, Zircon or Tranzanite (Symbolizes peace and success)");
            System.out.println("Birth Flower: Narcissus or Holly");
            System.out.println("Symbolism: Hope, Celebration and Wisdom");
         }
         else if(Arrays.asList(December2).contains(userDayOfMonth)){
            System.out.println("Your birth month is " + userMonth + " and your birthdate is " + userDayOfMonth);
            
            System.out.println("");
            System.out.println("Zodiac Sign: Capricorn");
            System.out.println("Birthstone: Turquoise, Zircon or Tranzanite (Symbolizes peace and success)");
            System.out.println("Birth Flower: Narcissus or Holly");
            System.out.println("Symbolism: Hope, Celebration and Wisdom");
         }
         else{
            System.out.println("Invalid!");
            scanner.close();
         }
      }
      else{
         System.out.println(userMonth + " is not a month");
         scanner.close();
         return;
      }
   }
}