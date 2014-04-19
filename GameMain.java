import java.awt.*; 
import javax.swing.JFrame; 

/** 
 * Main class for the game 
 */ 
public class GameMain extends JFrame 
{
        boolean isRunning = true;
        int fps = 30;
        int windowHeight = 500;
        int windowWidth = 500;
        int x = 20;
        public static void main(String[] args) 
        { 
                GameMain game = new GameMain(); 
                game.run(); 
                System.exit(0); 
        } 
        public void run() 
        { 
                initialize(); 
        
        while(isRunning) 
        { 
                long time = System.currentTimeMillis(); 
                update(); 
                draw(); 
                
                //  delay for each frame  -   time it took for one frame 
                time = (1000 / fps) - (System.currentTimeMillis() - time); 
                
                if (time > 0) 
                { 
                        try 
                        { 
                                Thread.sleep(time); 
                        } 
                        catch(Exception e){} 
                } 
        } 
        
        setVisible(false); 
        } 
        
        /** 
         * 
         */ 
        void initialize() 
        { 
                setTitle("Game Tutorial"); 
                setSize(windowWidth, windowHeight); 
                setResizable(false); 
                setDefaultCloseOperation(EXIT_ON_CLOSE); 
                setVisible(true);
        } 
        
        /** 
         * 
         */ 
        void update() 
        { 
                Graphics g = getGraphics(); 
                g.setColor(Color.WHITE); 
                g.fillRect(0, 0, windowWidth, windowHeight); 
                g.setColor(Color.BLACK); 
                g.drawRect(x++, 50, 50, 20); 
        } 
        
        /** 
         * 
         */ 
        void draw() 
        { 
                
        } 
}//end GameMain()