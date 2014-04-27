/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

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
        private Clip clip;
        public void playAudio(){
            String path = Audio.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            String decodedPath = "";
            String file = (decodedPath += "/GUI/Sounds/sample.wav");
            Clip clip;
            try {
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/GUI/Sounds/unleashed.wav"));
                clip = AudioSystem.getClip();
                clip.open(inputStream);
                clip.loop(LOOP_CONTINUOUSLY);
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {}
        }
        public void STOP() {
                clip.close();
        }
}//end class Audio
