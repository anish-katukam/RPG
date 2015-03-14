import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.Graphics;

public class GTextIO extends JComponent
{

    public void paintComponent(Graphics g, String dialogue){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int x = 75;
        int y = 75;
        Font fixedsys = loadFont();
        g2.drawString(dialogue,75,75);
    }   

    public Font loadFont(){
        Font font = null; 
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            font = Font.createFont(Font.TRUETYPE_FONT, new File("vgafix.fon"));
        } catch (Exception e) {
            
        }
        return font;
    }
}