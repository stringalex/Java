import java.util.Scanner;
public class InputValidationExercise {
  
  public static void main(String[] args){
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter desired flavor: ");
    String flavor = keyboard.nextLine().toLowerCase();
    
    //validation loop
    
    while( !flavor.equals("chocolate") && !flavor.equals("vanilla")) {
      System.out.println("Invalid age. Try again.");
      System.out.println("Must choose chocolate or vanilla");
      flavor = keyboard.nextLine();
    }
    System.out.println("Now serving " + flavor + " ice cream.");
  }
}