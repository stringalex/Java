import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
          
    Scanner keyboard = new Scanner(System.in);
    
    //enter #
    System.out.println();
    int n = keyboard.nextInt();
    
    //validation loop
    
    while( n < 1 || n > 10) {
        System.out.println("TRY AGAIN");
          n = keyboard.nextInt();
          
    }
    System.out.println("THANK YOU");
    
    }
}