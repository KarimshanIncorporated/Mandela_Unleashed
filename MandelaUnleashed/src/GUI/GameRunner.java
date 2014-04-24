/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

import javax.swing.JFrame;

public class GameRunner {
    private boolean isRunning;
    GameGUI game;
    
    public GameRunner() {
    }
    
    public GameRunner(GameGUI g) {
        isRunning = true;
        game = g;
    }
    
    //All of the action happens here
    public void run() {
        initializeGUI(game);
        //TODO
    }
    
    //Initializes the frame
    public void initializeGUI(GameGUI g) {
        g.setResizable(false); 
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setTitle("Mandela Unleashed");
        g.setVisible(true);
    }
    
    //Closes the game
    public void stopGame() {
       game.setVisible(false);
       System.exit(0);
    }
}//end class GameRunner
