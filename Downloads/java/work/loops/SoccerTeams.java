import javax.swing.JOptionPane;

public class SoccerTeams {
  
  public static void main(String[] args){
    
    final int MIN_PLAYERS = 9;    //minimum players per team
    final int MAX_PLAYERS = 15;   //maximun players per team
    
    
    //get # of players per team
    
    String input = JOptionPane.showInputDialog("Enter the number of " + 
                                        "players per team.");
    
    int teamSize = Integer.parseInt(input);
    
    //validate number entered
    
    while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
    {
      input = JOptionPane.showInputDialog("The number must be at least " +
                                          MIN_PLAYERS + " and no more than " +
                                          MAX_PLAYERS + ".\n Enter " + 
                                          "the number of players.");
      teamSize = Integer.parseInt(input);
    }
    
    //get # of available players
    
    input = JOptionPane.showInputDialog("Enter the available " +
                                        "number of players.");
    int players = Integer.parseInt(input);
    
    //validate number
    
    while (players < 0)
    {
      input = JOptionPane.showInputDialog("Enter 0 or greater.");
      players = Integer.parseInt(input);
    }
    
    // calculate number of teams
    
    int teams = players/teamSize;
    
    //calculated the number of leftover players
    
    int leftover = players % teamSize;
    
    //Display Results
    
    JOptionPane.showMessageDialog(null, "There will be " + teams +
                                  " teams with " + leftover + 
                                  " players left over.");
    System.exit(0);
  }
}

                                  
       