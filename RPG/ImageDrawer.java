import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class ImageDrawer extends JComponent
{
    private int image_index;
    private static BufferedImage[] listOfImages = new BufferedImage[4];
    
    public ImageDrawer(int index)
    {
         try {
            
            listOfImages[0] = ImageIO.read(new File("Resources/Splashes/OpeningSplash.jpg"));
            listOfImages[1] = ImageIO.read(new File("chapter1.jpg"));
            listOfImages[2] = ImageIO.read(new File("chapter2.jpg"));
            listOfImages[3] = ImageIO.read(new File("chapter3.jpg"));
        } catch (IOException e) {
        }
        image_index = index;
    }
    public static BufferedImage getImage(int index)
    {
        return listOfImages[index];
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(util.resize_img(util.screen_size, listOfImages[image_index]), 0, 0, this);
    }
}
