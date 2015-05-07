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
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("icons/handwriting.gif");
        java.awt.Cursor c = toolkit.createCustomCursor(image, new Point(frame.getX(), frame.getY()), "img");
        frame.setCursor (c);

        final JFXPanel fxPanel = new JFXPanel(); 
        frame.add(fxPanel); 
        initFX(fxPanel); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new OpeningSplash());
        frame.setVisible(true);
    }

    private static void initFX(JFXPanel fxPanel) {
    }

}
