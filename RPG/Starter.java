import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.embed.swing.JFXPanel;
//import javafx.scene.*;

public class Starter
{
    static final JFrame frame = new JFrame("Swords & Sworcery");
    static final OurGraphics graphics = new OurGraphics();
    public static void main (String Args[]){


        frame.setSize((int)util.screen_size.getWidth(),(int)util.screen_size.getHeight());
        
        String[] yesOrNo = {"Yes","No"};
        
        response = (String) JOptionPane.showInputDialog(null, "Which European Leader would you like to be?", "Leader", JOptionPane.PLAIN_MESSAGE,null, leaders, leaders[0]);
        
        //         final JLayeredPane layeredPane = new JLayeredPane();
        //         final JPanel menu = new JPanel(new GridLayout(6, 1));
        //         menu.setBounds(500, 150, 500, 500);
        //         JButton option1 = new JButton("option1");
        //         JButton option2 = new JButton("option2");
        //         JButton option3 = new JButton("option3");
        //         JButton option4 = new JButton("option4");
        //         JButton option5 = new JButton("option5");
        //         JButton option6 = new JButton("option6");
        //         menu.add(option1);
        //         menu.add(option2);
        //         menu.add(option3);
        //         menu.add(option4);
        //         menu.add(option5);
        //         menu.add(option6);
        //         final JButton menuButton = new JButton("Menu");
        //         menuButton.setBounds(1350, 60, 50, 50);

        // //        final JFXPanel fxPanel = new JFXPanel(); 
        //         frame.add(fxPanel); 
        //         initFX(fxPanel); 
        //         frame.setDefaultfullScreenButtonOperation(JFrame.EXIT_ON_fullScreenButton);

        //frame.add(new OpeningSplash());
        //JButton fullScreenButton = new JButton(new ImageIcon("Full_Screen_Icon.png"));

        //         final JButton fullScreenButton = new JButton(new ImageIcon("Full_Screen_Icon.png"));
        //         fullScreenButton.setOpaque(false);
        //         fullScreenButton.setContentAreaFilled(false);
        //         fullScreenButton.setBorderPainted(false);
        //         fullScreenButton.setBounds(1350, 0, 50, 50);

        //JPanel masterPanel = new JPanel(new BorderLayout());
        //frame.add(new OpeningSplash());
        //layeredPane.add(new OpeningSplash(), JLayeredPane.DEFAULT_LAYER);
        //frame.add(new OpeningSplash());
        //         OpeningSplash image = new OpeningSplash();
        // 
        //         image.setBounds(0, 0, 1920, 1080);

        //buttonOptionPane.add(test, new Integer(0));
        //         layeredPane.add(menuButton, new Integer(1));
        //         layeredPane.add(fullScreenButton, new Integer(1));
        //         layeredPane.add(image, new Integer(0));

        //masterPanel.add(fullScreenButton, BorderLayout.NORTH);
        //frame.add(masterPanel);
        //frame.add(new OpeningSplash());
        GameLogic.character.setSprites(new String[] {"Resources/sprite_test.png"});
        GameLogic.character.setPosition(100,100);
        GameLogic.character.set_curr_sprite(0);
        
        //e.moveTo(new Point(500,500), 5000);
        graphics.addEntity(GameLogic.character);
        frame.add(graphics.getGraphics(0));
        frame.setUndecorated(true);
        
        frame.setVisible(true);

        //The buttonlistnere class will be used later to do stuff with the minimize and fullScreenButton buttons
        //         class ButtonListener implements ActionListener
        //         {
        //             public void actionPerformed(ActionEvent e)
        //             {
        //                 if (e.getSource() == graphics.fullScreenButton)
        //                 {
        //                     frame.dispose();
        //                     frame.setUndecorated(!frame.isUndecorated());
        //                     frame.pack();
        //                     frame.setSize(1500,900);
        //                     frame.setVisible(true);
        //                 }
        // 
        //                 if (e.getSource() == graphics.menuButton)
        //                 {
        // 
        //                     graphics.changeGraphics()layeredPane.add(menu, new Integer(2));
        // 
        //                 }
        //             }
        //         }


    }
    //   private static void initFX(JFXPanel fxPanel) {
    //   }

}
