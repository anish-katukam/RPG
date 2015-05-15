import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class moveThreader extends Thread
{
    private int d;
    private Point p;
    private Entity e;
    static volatile boolean cancel = false;
    public moveThreader(Entity _e, Point _p, int _d)
    {
        e=_e;
        p=_p;
        d=_d;
        this.start();
    }

    public void run()
    {
        long millis = System.currentTimeMillis();
        double x_orig = e.getPosition().getX();
        double y_orig = e.getPosition().getY();
        double x_distance = p.getX() - e.getPosition().getX();
        double y_distance = p.getY() - e.getPosition().getY();
        long curr_time = System.currentTimeMillis() - millis;
        while (!cancel && curr_time < d)
        {
            try {
                this.sleep(50);
            }
            catch (Exception e) {}

            curr_time = System.currentTimeMillis() - millis;
            double new_x = ((curr_time/d)*x_distance)+x_orig;
            double new_y = ((curr_time/d)*y_distance)+y_orig;
            e.setPosition((int)new_x, (int)new_y);
            e.repaint();
            Starter.frame.repaint();
        }
            cancel = false;
        
    }
    //     private Point linear_handler(Point p1, Point p2, double f)
    //     {
    //         
    //     }
    public static void cancel()
    {
        cancel = true;
    }
}
