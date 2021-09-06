import java.util.Scanner;

public class TestAverage1 {
  
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    char repeat;
    do
    {
    
    System.out.println("Enter score #1: ");
    int score1 = keyboard.nextInt();
    
    System.out.println("Enter score #2: ");
    int score2 = keyboard.nextInt();
    
    System.out.println("Enter score #3: ");
    int score3 = keyboard.nextInt();
    
    keyboard.nextLine();
    
    //calculate average
    
    double average = (score1 + score2 + score3) / 3.0;
    
    System.out.println("The average is " + average);
    System.out.println("Would you like to average another" + 
                       " set of test scores?");
    System.out.print("Enter Y for yes or N for no: ");
    String input = keyboard.nextLine();
    repeat = input.charAt(0);
  
    } while (repeat == 'Y' || repeat == 'y');
  }
}
    