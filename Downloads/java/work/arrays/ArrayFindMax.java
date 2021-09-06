
public class ArrayFindMax{
  
  public static void main(String[] args){ 
    
    double [] array = {-5,-9,-3,-1,-7};
    double max = array[0];
    
    for(int i = 0; i < array.length; i++) 
    {
      if(array[i] > max)
      {
        max = array[i];
      }
      
    }
   System.out.println("The max is: " + max);
    
    
    
    
    
  }
}