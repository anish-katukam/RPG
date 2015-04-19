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

public class Starter
{
    public static void main (String Args[]){
        JFrame frame = new JFrame("Swords & Sworcery");               
        frame.setSize(1920,1080);
        frame.setUndecorated(true);

        final JFXPanel fxPanel = new JFXPanel(); 
        frame.add(fxPanel); 
        initFX(fxPanel); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 


        frame.add(new OpeningSplash());
        MUSIK.playIntro();
        frame.setVisible(true);
    }

    private static void initFX(JFXPanel fxPanel) {
    }

}
