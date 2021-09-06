public class loopExercise {
  
  public static void main(String [] args) {
    
    //exercise 1
    for(int i = 10; i <= 100000; i*=10)
    {
      System.out.println("i = " + i);
    }
    //exercise 2 
    for(double i = .2; i < 1.4; i+=0.2)
    {
      System.out.println("i = " + i);
    }
    //exercise 3
    for(int i = -3; i < 4; i++)
    {
      System.out.println("i = " + i);
    }
    for(int i = 1; i <= 15; i+=2)
    {
      
      if ( i != 5) {
        System.out.println("i = " + i);
      }
    }
  }
}