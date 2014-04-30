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
    public static Audio mus = new Audio();
    public static void main(String[] args) {
        MandelaMain run = new MandelaMain();
        MainMenu mainM = new MainMenu();
        GameGUI gui = new GameGUI();
        run.initializeMenu(mainM);
        mus.setName("unleashed.wav");
        mus.playAudio();
        mainM.getObs(run, gui, mus);
    }
    
    public void initializeMenu(MainMenu m) {
        m.setSize(800, 600); 
        m.setResizable(false); 
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setTitle("Mandela Unleashed v0.1");
        m.setVisible(true);
    }
    
    public void stopMusic(Audio mus) {
        mus.STOP();
    }
    public void playMusic(Audio mus) {
        mus.playAudio();
    }
    public void initializeGUI(GameGUI g) {
        g.setSize(800,600); 
        g.setResizable(false); 
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setTitle("Mandela Unleashed v0.1");
        g.setVisible(true);
    }
    public void initializeLOSER(LOSER L) {
        L.setSize(800,600); 
        L.setResizable(false); 
        L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        L.setTitle("Mandela Unleashed v0.1");
        L.setVisible(true);
    }
    //Closes the game
        public static void stopGame() {
       System.exit(0);
    }
}//end class MandelaMain
