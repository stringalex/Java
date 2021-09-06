import java.io.*;
  
  public class FileWriteMulti {
  
  public static void main(String [] args) throws IOException{
    
    PrintWriter pw = new PrintWriter("my-file.txt");
    
    for(int i = 1; i <= 5; i++)
    {
      for (int j = 1; j <= 5; j++)
{
  pw.printf("%4d", i *j);
}
pw.println();
}
}
}