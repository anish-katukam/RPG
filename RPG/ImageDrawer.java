import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public abstract class ImageDrawer
{
    private static BufferedImage openingSplash = (BufferedImage) new ImageIcon("Resources/Splashes/OpeningSplash.jpg").getImage();
    private static BufferedImage chapter1Splash = (BufferedImage) new ImageIcon("chapter1.jpg").getImage();
    private static BufferedImage chapter2Splash = (BufferedImage) new ImageIcon("chapter2.jpg").getImage();
    private static BufferedImage chapter3Splash = (BufferedImage) new ImageIcon("chapter3.jpg").getImage();
    
    private static BufferedImage[] listOfImages = {openingSplash,chapter1Splash,chapter2Splash,chapter3Splash};
    
    public static BufferedImage getImage(int index)
    {
        return listOfImages[index];
    }
}
