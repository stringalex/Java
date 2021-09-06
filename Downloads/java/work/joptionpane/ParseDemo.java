import javax.swing.JOptionPane;

public class ParseDemo {
  
  public static void main(String[] args) {
    
    
    String ans = JOptionPane.showInputDialog("What is your birth year?");
    
    int year = Integer.parseInt(ans);
    
    JOptionPane.showMessageDialog(null,"You're " + (2019-year) + " years old.");
   
    
    
    
    
  }
}