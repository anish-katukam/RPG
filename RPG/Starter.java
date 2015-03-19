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
        frame.add(game);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.RED);
        /*CharacterComponent character = new CharacterComponent();
        frame.add(character);
        final Timer t = new Timer(100,character);

        class KeyboardListener implements KeyListener{

            @Override
            public void keyPressed (KeyEvent e){
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_UP){
                    character.setDirection (1);
                    t.start();
                }
                if (key == KeyEvent.VK_DOWN){ 
                    character.setDirection (2);
                    t.start();
                }
                if (key == KeyEvent.VK_LEFT){
                    character.setDirection (3);
                    t.start();
                }
                if (key == KeyEvent.VK_RIGHT){
                    character.setDirection (4);
                    t.start();
                }
                character.repaint();
            }

            @Override
            public void keyReleased (KeyEvent e) {

            }

            @Override
            public void keyTyped (KeyEvent e) {

            }

        }
        KeyboardListener listener  = new KeyboardListener();
        frame.addKeyListener(listener);*/
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
