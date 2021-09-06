public class Contribution {
  
  public static void main (String [] args) { 
    
    //variables to hold monthly pay and contribution 
    
    double monthlyPay = 6000;
    double contribution;
    
    // calculate the display of %5 contribution 
    
    contribution = monthlyPay * 0.05;
    
    System.out.println(" 5% contribution is " + contribution 
                         + " per month");
    
    contribution = monthlyPay * 0.08;
    
    System.out.println(" 8% contribution is " + contribution 
                         + " per month");
    
    contribution = monthlyPay * 0.1;
    
    System.out.println(" 10% contribution is " + contribution 
                         + " per month");
                       
  }
  
}
    