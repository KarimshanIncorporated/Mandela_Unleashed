/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

import PlotLibrary.ChapterOne;
import PlotLibrary.ChapterThree;
import PlotLibrary.ChapterTwo;
import GUI.GameGUI;
import java.io.*;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import static javax.sound.sampled.Clip.LOOP_CONTINUOUSLY;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.AudioStream;

public class Audio {
    ChapterOne one = new ChapterOne();
    ChapterTwo two = new ChapterTwo();
    ChapterThree three = new ChapterThree();
    static String name = "";
    static int storyPlace = 0;
    private Clip clip;
    public void setName(String name1) {
        name = name1;
    }
    public void setstoryPlace(int num) {
        storyPlace = num;
    }
    public void playAudio(){
            String path = Audio.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            String decodedPath = "";
            String file = (decodedPath += "/GUI/Sounds/" + name);
            try {
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(getClass().getResource("/GUI/Sounds/" + name));
                InputStream is = inputStream;
                clip = AudioSystem.getClip();
                clip.open(inputStream);
                clip.loop(LOOP_CONTINUOUSLY);
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {}
        }
        public void STOP() {
                clip.stop();
        }
       

}//end class Audio
