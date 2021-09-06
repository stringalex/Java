import java.util.Scanner;

public class InputDemo{
  
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter your first name: ");
    String fname = keyboard.nextLine();
    
    System.out.println("Enter your last name: ");
    String lname = keyboard.nextLine();
    
    System.out.println("Your last name has " + lname.length() +
                       " characters");
  }
}