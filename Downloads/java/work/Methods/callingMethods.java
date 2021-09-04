public class callingMethods {
  
  public static void main(String [] args) {
    a();
  }
  public static void a () 
  {
    System.out.println("Tomato");
    b();
    System.out.println("basil");
    
  }
  public static void b () 
  {
    c();
    System.out.println("orange");
    
  }
  public static void c () 
  {
    System.out.println("cheese");
    
  }
}