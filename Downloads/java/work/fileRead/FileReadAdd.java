import java.io.*;
import java.util.Scanner;

public class FileReadAdd {
  public static void main(String [] args) throws IOException{
    
    File f = new File("data.txt");
    
    Scanner file = new Scanner(f);
    
    //sum
    int sum = 0;
    
    //average 
    //int i = 0;
    
    //goes through file
    while(file.hasNextInt()) {
      int n = file.nextInt();
      sum += n;
      //i++
      
    }
    System.out.println(sum);
    //System.out.println((double)sum/i);
    file.close();
  }
}