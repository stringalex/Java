public class stringMethods { 
  
  public static void main (String [] args) {
    
    
    String message = "Java is great and fun!";
    
    String upper = message.toUpperCase();
    String lower = message.toLowerCase();
    char letter = message.charAt(2);
    int stringSize = message.length();
    
    
    System.out.println(upper);
    System.out.println(lower);
    System.out.println(letter);
    System.out.println(stringSize);
    
    
  }
}