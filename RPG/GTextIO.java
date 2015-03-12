import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class GTextIO extends JComponent
{
    public void paintComponent(Graphics g, String dialogue){
        Graphics2D g2 = (Graphics2D) g;
        int x = 75;
        int y = 75;
        
        for(char c : dialogue.toCharArray()){
            g2.drawString(dialogue,x,y);         //I GOTTA GET FIXEDSYS FONT WORKING
        }

    }   
}