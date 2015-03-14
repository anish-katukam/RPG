import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Starter
{
    public static void main (String Args[]){
        JFrame frame = new JFrame("Swords & Sworcery");
        frame.setSize(1920,1080);
        GraphicsEngine game = new GraphicsEngine();
        frame.setUndecorated(true);
        frame.add(game);
        frame.setVisible(true);
        //frame.getContentPane().setBackground(Color.BLACK);
        /*GameLogic g = new GameLogic(); //instantiates new gamelogic
        g.exposition(); 
        g.intro();
        g.chapterone(); //calling the scripted events
        //g.chaptertwo();
        //g.chapterthree();
        //g.outro(true);*/
        return;
    }
}
