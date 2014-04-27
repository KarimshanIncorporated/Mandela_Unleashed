/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

import PlotLibrary.*;
import javax.swing.JFrame;

public class MandelaMain{
    
    boolean playMainTheme = true;
    
    public MandelaMain() {
        
    }
    public static void main(String[] args) {
        MandelaMain run = new MandelaMain();
        MainMenu mainM = new MainMenu();
        GameGUI gui = new GameGUI();
        Audio mus = new Audio();
        run.initializeMenu(mainM);
        mus.playAudio();
        mainM.getObs(run, gui, mus);
    }
    
    public void initializeMenu(MainMenu m) {
        m.setSize(800, 600); 
        m.setResizable(false); 
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setTitle("Mandela Unleashed");
        m.setVisible(true);
    }
    public void initializeGUI(GameGUI g) {
        g.setSize(800,600); 
        g.setResizable(false); 
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setTitle("Mandela Unleashed");
        g.setVisible(true);
    }
    
    public void stopMusic(Audio mus) {
        mus.STOP();
    }
    
    //Closes the game
        public static void stopGame() {
       System.exit(0);
    }
}//end class MandelaMain
