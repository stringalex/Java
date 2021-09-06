import javax.swing.JOptionPane;

public class NestedDecision {
  
  public static void main(String [] args) {
    
    String input = JOptionPane.showInputDialog("Enter your numeric " +
                                               "test score and i will tell " +
                                               "you the grade: ");
    
    //Get number from input
    int testScore = Integer.parseInt(input);
    
    if (testScore < 60) 
    {
      JOptionPane.showMessageDialog(null, "Your grade is F.");
    }
    else
    {
      if (testScore < 70)
      {
        JOptionPane.showMessageDialog(null, "Your grade is D.");
      }
      else
      {
        if(testScore < 80)
        {
          JOptionPane.showMessageDialog(null, "Your grade is C.");
        }
        else
        {
          if(testScore < 90)
          {
            JOptionPane.showMessageDialog(null, "Your grade is B.");
          }
          else
          {
              JOptionPane.showMessageDialog(null, "Your grade is A.");
            }
          }
        }
    }
     System.exit(0);
    }
  }
