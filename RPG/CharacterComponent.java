import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class CharacterComponent extends JComponent implements ActionListener
{

    private int x = 10, y = 10;
    private boolean u,d,l,r;
    public void paintComponent (Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("character.jpg"));
        } catch (IOException e) {
        }
        g2.drawImage(img, x, y, this);
    }

    public void setDirection (int x)
    {
        if (x==1) 
        {
            u = true; 
            d = false;
            l = false;
            r = false;
        }
        else if (x==2)
        {
            u = false;
            d = true;
            l = false;
            r = false;
        }
        else if (x==3)
        {
            u = false;
            d = false;
            l = true;
            r = false;
        }
        else if (x==4)
        {
            u = false;
            d = false;
            l = false;
            r = true;
        }

    }

    public void actionPerformed(ActionEvent e) 
    {
        if (u) {
            move (0,-5);
        }
        else if (d) {
            move (0, 5);
        }
        else if (l) {
            move (-5, 0);
        }
        else if (r) {
            move (5,0);
        }
        repaint();
    }

    public void move (int xinc, int yinc)
    {
        x += xinc; 
        y += yinc;
        repaint(); 

    }


}
