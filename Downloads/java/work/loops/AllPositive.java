import java.util.Scanner;

public class AllPositive {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
    //enter #
    
    int n = keyboard.nextInt();
    
    //validation loop
    
    while( n > 0) {
          n = keyboard.nextInt();
          if( n > 100 && n > 0){
              System.out.println(n);
              
          }
    }
   
    
    }
        
    }
