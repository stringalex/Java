import java.util.Scanner;
public class InputValidationDemo {
  
  public static void main(String[] args){
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter your age: ");
    int age = keyboard.nextInt();
    
    //validation loop
    
    while( age < 0 || age > 120 ) {
      System.out.println("Invalid age. Try again.");
      System.out.println("Age must be between 0 and 120");
      age = keyboard.nextInt();
    }
    System.out.println("Thank you");
  }
}
    
    