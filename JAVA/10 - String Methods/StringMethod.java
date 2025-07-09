package StringMethod.java;

public class StringMethod{
   public static void main(String[] args){
      
      String name1, name2, name3, name4;
      String name = "  Michael Angelo  ";
      
      int length = name.length();
      char letter = name.charAt(2);
      int index = name.indexOf("M");
      int lastIndex = name.lastIndexOf("o");
      
      System.out.println(length);
      System.out.println(letter);
      System.out.println(index);
      System.out.println(lastIndex);
      
      name1 = name.toUpperCase();
      name2 = name.toLowerCase();
      name3 = name.trim();
      name4 = name.replace("o", "a");
      
      System.out.println(name1);
      System.out.println(name2);
      System.out.println(name3);
      System.out.println(name4);
      
      if(name.isEmpty()){
         System.out.println("Your name is Empty");
      }else{
         System.out.println("Your name ISN'T Empty");
      }
      
      if(name.contains(" ")){
         System.out.println("Your name contain spaces");
      }else{
         System.out.println("Your name DOESN'T contain any spaces");
      }
      
      if(name.equals("password")){
         System.out.println("Your name cannot be password");
      }else{
         System.out.println("Hello, " +  name);
      }
      
      if(name.equalsIgnoreCase("password")){
         System.out.println("Your name cannot be password");
      }else{
         System.out.println("Hello, " +  name);
      }
      
   }
}
