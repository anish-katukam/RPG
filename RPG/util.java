import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public abstract class util
{
    public static final Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
    static Point map_to_frame(JFrame frame, Point p)
    {
        Dimension d = frame.getContentPane().getSize();
        int x = (int)(d.getWidth()*(p.getX()))/(1920);
        int y = (int)(d.getHeight()*(p.getY()))/(1080);
        p.setLocation(x,y);
        return p;

    }
    
    static BufferedImage resize_img(JFrame frame, BufferedImage i)
    {
        Dimension d = frame.getContentPane().getSize();
        return toBufferedImage(i.getScaledInstance((int)d.getWidth(),(int)d.getHeight(), Image.SCALE_FAST));

    }
    
    public static BufferedImage toBufferedImage(Image img)
    {
        if (img instanceof BufferedImage)
        {
            return (BufferedImage) img;
        }
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();
        return bimage;
    }
}