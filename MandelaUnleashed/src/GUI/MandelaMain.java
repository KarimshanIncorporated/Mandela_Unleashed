/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

public class MandelaMain{
    //Runs the program
    public static void main(String[] args) {
        GameGUI gui = new GameGUI();
        //initialize(gui);
        GameRunner game = new GameRunner(gui);
        game.run();
        //System.exit(0);
    }
}//end class MandelaMain
