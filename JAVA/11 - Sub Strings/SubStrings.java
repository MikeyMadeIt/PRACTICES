package SubStrings.java;
import java.util.Scanner;

public class SubStrings{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      String email, username, domain;
      
      System.out.print("Enter your email: ");
      email = scanner.nextLine();
      if(!email.contains("@")){
         System.out.print("This is not a valid email!");
         scanner.close();
         return;
      }
      
      username = email.substring(0, email.indexOf("@"));
      domain = email.substring(email.indexOf("@") + 1);
      
      System.out.println("Username: " + username);
      System.out.println("Domain: " + domain);
      
      scanner.close();
   }
}
