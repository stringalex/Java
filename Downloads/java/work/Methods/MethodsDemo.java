public class MethodsDemo {
  
  public static void main(String[] args) 
  {
    
    greetUser();
    //sayBye();
    
    //for( int i = 0; i < 3; i++){
    //  greetUser();}
    greeting("morning", "sara");
    add(5,5);
  
  }
  //add
  public static void add(int a, int b) {
   System.out.println(a + "+" + b + "=" + (a+b)); 
  }
  
  public static void greetUser() {
    
    System.out.println("Hello");
    sayBye();
  }
  
  public static void sayBye() {
    
    System.out.println("Goodbye!");
  }
  public static void greeting(String time, String name){
    System.out.println("Good " + time + ", " + name);
  }
  
}