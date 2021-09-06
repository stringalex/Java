import java.util.Scanner;
import java.io.*;

public class FileWriteDemo2 {
  public static void main(String[] args) throws IOException {
    
    String filename;
    String friendName;
    int numFriends;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("How many friends do you have? ");
    numFriends = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.print("Enter the filename: ");
    filename = keyboard.nextLine();
    
    File file = new File(filename);
    if(file.exists()) {
      System.out.println("The file " + filename + " already exists.");
      System.exit(0);
    }
    
    //open file
    PrintWriter outputFile = new PrintWriter(file);
    
    //get data and write to file
    for (int i = 1; i <= numFriends; i++)
    {
      System.out.print("enter the name of friend " + 
                       "number " + i + ": ");
      friendName = keyboard.nextLine();
      
      outputFile.println(friendName);
    }
    // close the file
    outputFile.close();
    System.out.println("Data written to the file.");
  }
}

      