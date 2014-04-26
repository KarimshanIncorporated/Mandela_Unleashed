/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

import java.io.*;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Audio {
        public void playAudio() {
            String path = Audio.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            String decodedPath = "";
            try {
                decodedPath = URLDecoder.decode(path, "UTF-8");
            } catch (UnsupportedEncodingException ex) {}
            String file = (decodedPath += "/GUI/Sounds/sample.wav");
            InputStream in = null;
            try {
                in = new FileInputStream(file);
            } catch (FileNotFoundException ex) {}
            AudioStream audioStream = null;
            try {
                audioStream = new AudioStream(in);
            } catch (IOException ex) {}
            AudioPlayer.player.start(audioStream);
        }
}
