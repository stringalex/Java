import java.util.Scanner;
import java.io.*;

public class FileWriteDemo
{
  public static void main (String[] args) throws IOException
  {
    String filename; 
    String friendName;
    int numFriends;
    
    Scanner keyboard = new Scanner(System.in);
    
    //get #of friends
    System.out.print("How many friends do you have?");
    numFriends = keyboard.nextInt();
    
    //clear new line
    keyboard.nextLine();
    
    //get file name
    System.out.print("Enter the filename:");
    filename = keyboard.nextLine();
    
    //open file
    PrintWriter outputFile = new PrintWriter(filename);
    
    //get name of friends
    for (int i = 1; i <= numFriends; i++)
      
    {
      System.out.print("Enter the name of friend" + 
                       "number" + i + ":");
      friendName = keyboard.nextLine(); 
      
      //write to file
      outputFile.println(friendName);
      
      
    }
    //close file
    outputFile.close();
    System.out.println("Data written to the file.");
  }
}

