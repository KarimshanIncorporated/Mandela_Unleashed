/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class AudioPlayer extends JApplet{
    public class Sound {
        private AudioClip audioClip;
        private URL path;
        Sound (String fileName) {
            try {
                path = new URL(getCodeBase(),fileName);
                audioClip = Applet.newAudioClip(path);
            }
            catch(Exception e){}
        }
        public void playSound() {
            audioClip.loop();
        }
        public void stopSound() {
            audioClip.stop();
        }
        public void playSoundOnce() {
            audioClip.play();
        }
    }
    public void init() {
        Sound testsong = new Sound("/GUI/Sounds/PatScream.mp3");
        testsong.playSound();
    }
}