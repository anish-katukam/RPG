import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.Graphics;

public class GTextIO extends JComponent
{
    public static void dramatic(Graphics g, String dialogue){
        Graphics2D g2 = (Graphics2D) g;
        int x = 75;
        int y = 75;
        Font fixedsys = loadFont();
        GraphicsEnvironment ge = 
            GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(fixedsys);
        g2.setFont(fixedsys);
        g2.drawString(dialogue,75,75);
    }   

    public static Font loadFont(){
        Font font = null; 
        try (InputStream stream = GTextIO.class.getResourceAsStream("vgafix.ttf")) {
            font = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(50f);
        } catch(FontFormatException | IOException e){
            System.out.println("Something went wrong" + e);            
        }
        return font;
    }
}