import javax.swing.JOptionPane;

public class PayrollDialog { 
  
  public static void main(String [] args) {
    
    String inputstring; // for reading input
    String name;        // the username
    int hours;          
    double payrate;
    double grosspay;
    
    // get name using joption pane
    
    name = JOptionPane.showInputDialog("What is your name? ");
    
    // get hours
   inputstring = JOptionPane.showInputDialog("How many hours " + 
                                             "did u work this week? ");
   
   //convert input to an int
   
   hours = Integer.parseInt(inputstring);
   
   inputstring = JOptionPane.showInputDialog("What is your " + 
                                             "hourly pay rate? ");
   // convert the input to a double 
   
   payrate = Double.parseDouble(inputstring);
   
   grosspay = hours * payrate;
   
   JOptionPane.showMessageDialog(null, "Hello " + 
                                 name + ". Your gross pay is $" + 
                                 grosspay);
   
   System.exit(0);
   
  }
  
}
   