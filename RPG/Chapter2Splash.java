import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Chapter2Splash extends JComponent
{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("chapter2.jpg"));
        } catch (IOException e) {
        }
        g2.drawImage(img, 0, 0, this);
    }   
}