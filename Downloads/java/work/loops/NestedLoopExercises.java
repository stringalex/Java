public class NestedLoopExercises {
  
  public static void main(String[] args){
    
    //exercise 1
   /*  for (int j = 0; j < 3;j++)
    {
      for(int i = 6; i > 0; i--)
      {
        System.out.print(i + " ");
        
      }
      System.out.println();
            
     }*/
     //exercise 2
     //** 
    //**** 
    //******
     
     for (int j = 0; j < 3;j++)
    {
      for(int i = 0; i < j+1; i++)
      {
        System.out.print("**");
      }
      System.out.println();
     }
     
     //exercise 3
     //1
     //11
     //111
      for (int j = 0; j < 3;j++)
    {
      for(int i = 0; i < j+1; i++)
      {
        System.out.print("1");
      }
      System.out.println();
    }
      
      //exercise 4
      //1
      //22
      //333
      for (int j = 1; j <= 3;j++)
    {
      for(int i =0; i < j; i++)
      {
        System.out.print(i);
      }
      System.out.println();
  }
      
      // exercise 5
      //1 2 3
      //3 6 9
     for (int j = 1; j < 3;j+=2)
    {
      for(int i = 1; i <= j; i++)
      {
        System.out.print(i*j + " ");
      }
      System.out.println();
}
}
}