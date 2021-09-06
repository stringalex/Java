import java.util.Scanner;
public class reverseString{
  
  public static void main(String [] args){
    
    String reverse="",string="";
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter a String: ");
    string = keyboard.nextLine();
    //String string = "world";
    System.out.println("Original string is: " + string);
    
    for(int i = string.length()-1;i>=0;i--){
      
     reverse += string.charAt(i);
    }
    System.out.println("Reverse String is: "+ reverse);
    
    
    
  }
}