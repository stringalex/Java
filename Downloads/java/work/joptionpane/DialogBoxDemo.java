import javax.swing.JOptionPane;

public class DialogBoxDemo {
  
  public static void main(String[] args) {
    
    
    String name = JOptionPane.showInputDialog("What is your name?");
    
    
    JOptionPane.showMessageDialog(null,"Good Morning " + name);
    
    //Integer.parseInt(x);
    
    
    
    
  }
}