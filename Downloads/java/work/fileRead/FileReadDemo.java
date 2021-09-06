import java.util.Scanner;
import java.io.*;

public class FileReadDemo {
  public static void main(String[] args) throws IOException { 
    
    Scanner keyboard = new Scanner(System.in);
    
    //get the filename
    
    System.out.print("Enter the filename: ");
    String filename = keyboard.nextLine();
    
    //open file
    File file = new File(filename);
    
    //scanning the file
    Scanner inputFile = new Scanner(file);
    
    //go throught the file
    while (inputFile.hasNext()) {
      String friendName = inputFile.nextLine();
      
      //print out file names
      System.out.println(friendName);
    }
    //close file
    inputFile.close();
  }
}
      