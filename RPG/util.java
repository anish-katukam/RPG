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
        int x = (int)((d.getWidth()*(p.getX()))/(screen_size.getWidth()));
        int y = (int)((d.getHeight()*(p.getY()))/(screen_size.getHeight()));
        p.setLocation(x,y);
        return p;

    }

    static BufferedImage resize_img(Dimension d, BufferedImage i)
    {

        return toBufferedImage(i.getScaledInstance((int)d.getWidth(),(int)d.getHeight(), Image.SCALE_FAST));

    }
    public static Point screen_point_adjust(Point p)
    {
        p.setLocation(p.getX() - 160, p.getY() -200);
        return p;
    }
    public static BufferedImage toBufferedImage(Image img)
    {
        if (img instanceof BufferedImage)
        {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }
    public static BufferedImage blur(BufferedImage img)
    {
        float[] bits = {1.0f/9.0f, 1.0f/9.0f, 1.0f/9.0f, 1.0f/9.0f, 1.0f/9.0f, 1.0f/9.0f, 1.0f/9.0f, 1.0f/9.0f, 1.0f/9.0f};;
        Kernel kernel = new Kernel(3,3,bits);
        ConvolveOp convolve_op = new ConvolveOp(kernel);
        BufferedImage out = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        convolve_op.filter(img, out);
        return out;
    }
}