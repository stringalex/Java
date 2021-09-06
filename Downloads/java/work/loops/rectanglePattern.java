import java.util.Scanner;
public class rectanglePattern {
  
  public static void main(String [] args){
    
    Scanner k = new Scanner(System.in);
    
    System.out.println("How many rows?");
    int rows = k.nextInt();
    
    System.out.println("How many columns?");
    int cols = k.nextInt();
    
    for(int i = 0; i < rows; i++){
      for(int j = 0; j<cols; j++){
        
        System.out.print("*");
      }
      System.out.println();
    }
  }
}