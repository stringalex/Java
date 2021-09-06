import java.util.Scanner;

public class mulitplicationTable{

public static void main (String [] args) {
    
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    
    for(int i = 1; i <=n; i++) {
        
        
        for (int j = 1; j <= n; j++){
          System.out.print(i*j + " ");
          
        }
        System.out.println();
    }
}
}