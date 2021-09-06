import java.util.Scanner;

public class PayRollTwo {
  
  public static void main(String [] args){
    

    
    // Create scanner 
    Scanner keyboard = new Scanner(System.in);
    
    //Get Username
    
    System.out.println("What is your name? ");
    String name = keyboard.nextLine();
    
    //Get hours
    System.out.println("How many hours did you work this week? ");
    double hours = keyboard.nextDouble();
    
    // get hourly pay
    
    System.out.println("What is your hourly pay? ");
    double payrate = keyboard.nextDouble();
    
    //calculate grosspay
    
    double grosspay = payrate * hours;
    
    System.out.println("Hello " + name);
    System.out.println("Your pay is " + grosspay);
    
  }
  
}
    
                   