import java.io.*;
import java.util.Scanner;

public class FileReadingDemo {
  public static void main(String[] args) throws IOException{ 
    
    File f = new File("data.txt");
    
    Scanner file = new Scanner(f);
    
    //String line = file.nextLine();
    //System.out.println(line);
    
    //adding 
    int line = file.nextInt();
    System.out.println(line);
    int line2 = file.nextInt();
    System.out.println(line2);
    
    System.out.println(line + line2);
    
    /*
     * while(file.hasNextInt()) {
     * int n = file.nextInt();
     * sum +=n;
     * }
     * System.out.println(j);
     * */
    
    
    file.close();
  }
}