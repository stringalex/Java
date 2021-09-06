import java.util.Scanner;
public class ComputeTip{
  
  public static void main(String[] args) {
    
    // Create scanner 
    Scanner keyboard = new Scanner(System.in);
    
    //Get bill total
    
    System.out.println("Enter bill total:");
    double bill = keyboard.nextDouble();
    
    //get tip amount
    
    double tip = bill * 0.15;
    
    System.out.println("Your total with tip is: $" + bill);
    System.out.println("You should tip at least: $" + tip);
    
  }
}