public class returnDemo{
  
  public static void main(String[] args){
    
    int value = add(5,15,43);
    System.out.println(value);
   // System.out.println(f(5));
    
    
  }
  
  public static int add(int a, int b, int c)
  {
    return a + b + c;
  }
  public static int f(int x){
    
    return 2 * x + 1;
    
  }
}