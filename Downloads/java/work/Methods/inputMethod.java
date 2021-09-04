import java.util.Scanner;

public class inputMethod{
  
  public static void main(String [] args) {
    //create scanner
    Scanner keyboard = new Scanner(System.in);
    
    //receive name
    System.out.println("What is your name?");
    String name = keyboard.nextLine();
    
    //call greet method
    greetUser(name);
  }
  
  //greeting method
  public static void greetUser(String name) {
    
   System.out.println("Hello " + name.toUpperCase()); 
  }
}