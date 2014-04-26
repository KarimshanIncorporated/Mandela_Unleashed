/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

import sun.audio.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AudioPlayer
{
    public AudioPlayer(){
        String file = ("/Users/Johnny Hoang/Desktop/sample.wav");
        InputStream in;
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException ex) {}
        AudioStream audioStream = new AudioStream();
        try {
            audioStream = new AudioStream(in);
        } catch (IOException ex) {}
        sun.audio.AudioPlayer.player.start(audioStream);
    }
}