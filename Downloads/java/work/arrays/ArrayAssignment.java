//array assignment 
//Alex Stringer 
//5/2/2019

import java.util.Scanner;

public class ArrayAssignment {
  public static void main(String[] args) {
    
    //Scanner
    Scanner keyboard = new Scanner(System.in);
    
    //Retrieve name
    System.out.println("Please enter your name.");
    String name = keyboard.nextLine();
    
    //Retrieve number of days
    System.out.println("Please enter number of days studied.");
    int days = keyboard.nextInt();
    
    //create the array
    double [] hours = new double[days]; 
    double sum = 0;
    double max = hours[0];
    
    //get hours studied each day
    for(int i = 0; i < hours.length ; i++)
    {
      System.out.println("Please enter the number of hours studied on day " 
                           + (i+1) + ":\n"); 
      hours[i] = keyboard.nextDouble();
      
      //get sum
      sum += hours[i];
      
      //find the max
      if(hours[i] > max)
      {
        max = hours[i];
      }
    }
    
    //find min
    double min = hours[0];
    
      for(int j = 0; j < hours.length; j++)
    {
      //find min
      
      if(min > hours[j])
      {
        min = hours[j];
      }
    
      }
    
    //message
    System.out.println("Dear " + name + ",\n\n" + 
                       "Here are the statistics about your study time:\n");
    //average time studied
    System.out.printf("* On average, you studied for %.2f %s"
                        , (sum/days) , "hours/day.\n");
    //min and max time studied
    System.out.println("* Your largest study time was " + (int)(max) + " hours.\n" + 
                       "* Your shortest study time was " + (int)(min) + " hours.\n\n" +
                       "Good Luck on your next test!");
    
  }
  }

