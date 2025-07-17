import java.util.Scanner;

public class QuizGame{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      String guess;
      int score = 0;
      
      String[] questions = {
         "What is the result when you add 3 to a variable that originally holds the value 5?",
         "Which of the following is not a basic (primitive) data type in Java?",
         "In an array that contains the values 1, 2, and 3, what is the value at index 1?",
         "What is the purpose of a loop in programming?",
         "If a condition is true in a ternary operation, what kind of value is returned?"
      };
      
      String[][] choices = {
         {"a. 8", "b. 5", "c. 3", "d. 53"},
         {"a. int", "b. boolean", "c. String", "d. double"},
         {"a. 1", "b. 2", "c. 3", "d. Error"},
         {"a. To define a variable", "b. To call a function", "c. To repeat a block of code", "d. To stop the program"},
         {"a. 0", "b. 1", "c. 5", "d. 10"}
      };
         
      String[] answers = {"a", "c", "b", "c", "b"};
      
      for(int i = 0; i < questions.length; i++){
         System.out.println(questions[i]);
         for(String choice : choices[i]){
            System.out.println(choice);
         }
         System.out.print("Your answer: ");
         guess = scanner.nextLine().toLowerCase();
         
         if(guess.equals(answers[i])){
            System.out.println("Correct!!🎉");
            score++;
         }else{
            System.out.println("Inccorect!!");
            System.out.println("Correct Answer: " + answers[i]);
         }
         
         System.out.println("");
         System.out.println("Score:" + score + "/" + questions.length);
         System.out.println("");
      }
      
      
   }
} 
