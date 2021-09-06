import java.util.Scanner;

public class MailingLabel
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Please enter your first name:");
    String firstName = keyboard.nextLine();
    System.out.println("Please enter your last name:");
    String lastName = keyboard.nextLine();
    System.out.println("Please enter your street address:");
    String streetAddr = keyboard.nextLine();
    System.out.println("Please enter your city name:");
    String city = keyboard.nextLine();
    System.out.println("Please enter your state (2 letters):");
    String state = keyboard.nextLine();
    System.out.println("Please enter your ZIP code:");
    String zip = keyboard.nextLine();
    
    /**
     * EXERCISE
     * 
     * Objective: To practice calling String methods.
     * 
     * Your program shall display a mailing label
     * in the following format:
     * 
     * DOE, JANE <-- caps
     * 123 STREET ADDRESS <-- caps
     * EL PASO, TX 79968 <-- caps, all together
     * TRACKING NUMBER: J--D799tx <-- see below
     * 
     * The tracking number is obtained by concatenating
     * The first letter of the first name, two dashes (--),
     * the first letter for the last name, the first
     * three numbers of the zip code, and the state name
     * in lowercase.
     */
    
    
    System.out.println(lastName.toUpperCase() + ", " + firstName.toUpperCase());
    System.out.println(streetAddr.toUpperCase());
    System.out.println(city.toUpperCase() + ", " + state.toUpperCase() + " " +
                       zip);
    
    System.out.println("TRACKING NUMBER: " +firstName.toUpperCase().charAt(0)
                         + "--" + lastName.toUpperCase().charAt(0) + 
                       zip.substring(0,3) + state.toLowerCase());
  }
}