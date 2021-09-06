/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class ArrayOperations {
  
  public static void main(String[] args){
    
    Scanner keyboard = new Scanner(System.in);
    
    //ask user for amount of values
    System.out.println("How many numbers do you wish to enter ");
    int n = keyboard.nextInt();
    
    //create the array
    double [] array = new double [n];
    
    //get the numbers
    for(int i = 0; i < array.length; i++)
    {
      System.out.print("Enter your number: ");
      array[i] = keyboard.nextDouble();
      
    }
    
    //sum of the array
    double sum = 0;
    for(int i = 0; i < array.length; i++)
    {
      sum += array[i];
    }
    //sum
    System.out.println("The sum is " + sum);
    //average
    System.out.println("The average is " + sum/array.length);
    
    //find max
    double max = array[0];
    
    for(int i = 0; i < array.length; i++) 
    {
      if(array[i] > max)
      {
        max = array[i];
      }
      
    }
    System.out.println("The max is: " + max);
  }
  
}