import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class moveThreader extends Thread
{
    private volatile int d;
    private volatile Point p;
    private volatile Entity e;
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
        cancel = false;
        long millis = System.currentTimeMillis();
        double x_orig = e.getPosition().getX();
        double y_orig = e.getPosition().getY();
        double x_distance = p.getX() - e.getPosition().getX();
        double y_distance = p.getY() - e.getPosition().getY();
        double curr_time = System.currentTimeMillis() - millis;
        while (!cancel && curr_time < d)
        {
            curr_time = System.currentTimeMillis() - millis;
            e.setPosition((int)(((curr_time/d))*x_distance+x_orig), (int)(((curr_time/d))*y_distance+y_orig));
        }
        cancel = false;

    }
    public static void cancel()
    {
        cancel = true;
    }
}
