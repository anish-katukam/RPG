import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.embed.swing.JFXPanel;
import javafx.scene.*;

public class MUSIK
{
    private static void initFX(JFXPanel fxPanel) {
    }
    static String prettiestweed = "prettiestweed.mp3";
    public static void playIntro(){
        Media sound = new Media(new File(prettiestweed).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

}
