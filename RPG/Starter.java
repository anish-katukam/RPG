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
    public static void main (String Args[]){
                        
        frame.setSize(1500,900);
        JLayeredPane buttonOptionPane = new JLayeredPane();
        
        

        // //        final JFXPanel fxPanel = new JFXPanel(); 
        //         frame.add(fxPanel); 
        //         initFX(fxPanel); 
        //         frame.setDefaultfullScreenButtonOperation(JFrame.EXIT_ON_fullScreenButton);

        //frame.add(new OpeningSplash());
        //JButton fullScreenButton = new JButton(new ImageIcon("Full_Screen_Icon.png"));

        JButton fullScreenButton = new JButton(new ImageIcon("Full_Screen_Icon.png"));
        fullScreenButton.setOpaque(false);
        fullScreenButton.setContentAreaFilled(false);
        fullScreenButton.setBorderPainted(false);
        fullScreenButton.setBounds(1300, 100, 100, 100);
        
        
        
        //JPanel masterPanel = new JPanel(new BorderLayout());
        //frame.add(new OpeningSplash());
        //buttonOptionPane.add(new OpeningSplash(), JLayeredPane.DEFAULT_LAYER);
        //frame.add(new OpeningSplash());
        OpeningSplash image = new OpeningSplash();
        image.setBounds(0, 0, 1500, 900);
        buttonOptionPane.add(image, new Integer(0));
        buttonOptionPane.add(fullScreenButton, new Integer(1));
        
        //buttonOptionPane.add(test, new Integer(0));
        //masterPanel.add(fullScreenButton, BorderLayout.NORTH);
        //frame.add(masterPanel);
        //frame.add(new OpeningSplash());
        frame.add(buttonOptionPane);
        frame.setUndecorated(true);
        frame.setVisible(true);
        
        //The buttonlistnere class will be used later to do shit with the minimize and fullScreenButton buttons. Bitch.
        class ButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                frame.setUndecorated(!frame.isUndecorated());
                frame.pack();
                frame.setSize(1500,900);
                frame.setVisible(true);
                
            }
        }
        
        fullScreenButton.addActionListener(new ButtonListener());
        
        
    }
   

    //   private static void initFX(JFXPanel fxPanel) {
    //   }

}
