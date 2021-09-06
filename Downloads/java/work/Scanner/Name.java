import java.util.Scanner;

public class Name{
  
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter your name: ");
    String name = keyboard.nextLine();
    
    char first = name.charAt(0);
    
    int len = name.length();
    String upper = name.toUpperCase();
    
    System.out.println("Your first initial is " + first);
    System.out.println("The last letter in your name is " + 
                       name.charAt(name.length() - 1));
    System.out.println("Your name has " + len + " letters");
    System.out.println("Your name in caps is " + upper);
    System.out.println("We'll call you " + name.substring(0,4));
  }
}