/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/

package GUI;

import javax.swing.JFrame;

public class MandelaMain{
    //Runs the program
    public static void main(String[] args) {
        JFrame frame = new GameGUI();
        initialize(frame);
        //System.exit(0);
    }
    
    //Initializes the frame
    static void initialize(JFrame f) {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Mandela Unleashed");
        f.setVisible(true);
    }
}//end class MandelaMain
