import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class GraphicsEngine extends JComponent
{
    public void paintComponent(Graphics g){
        OpeningSplash splasho = new OpeningSplash();
        Chapter1Splash splash1 = new Chapter1Splash();
        Chapter2Splash splash2 = new Chapter2Splash();
        Chapter3Splash splash3 = new Chapter3Splash();
        GTextIO t = new GTextIO();
        /*splash1.paintComponent(g);              //ILL PUT THESE IN ONCE I GET DELAYS WORKED OUT
        splash2.paintComponent(g);
        splash3.paintComponent(g);
        splasho.paintComponent(g);*/ 
    }   
}