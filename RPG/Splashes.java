import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class Splashes
{
    public static void chapter1(){
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Graphics g = img.createGraphics();
        Graphics2D g2 = (Graphics2D) g;
        try {
            img = ImageIO.read(new File("chapter1.jpg"));
        } catch (IOException e) {
        }
        g2.drawImage(img, 0, 0, null);
    }
}
