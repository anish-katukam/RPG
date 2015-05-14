import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Graphics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OurGraphics
{
    // instance variables - replace the example below with your own
    final JLayeredPane openingPane;
    final JPanel menuPanel;
    final JButton option1;
    final JButton option2;
    final JButton option3;
    final JButton option4;
    final JButton option5;
    final JButton exitOption;
    final JButton menuButton;
    final JButton exitButton;
    OpeningSplash openingImage; 

    public OurGraphics()
    {
        openingPane = new JLayeredPane();

        menuPanel = new JPanel(new GridLayout(6, 1));
        menuPanel.setBounds(500, 150, 500, 500);

        menuButton = new JButton("Menu");
        menuButton.setBounds(1350, 60, 50, 50);

        option1 = new JButton("option1");
        option2 = new JButton("option2");
        option3 = new JButton("option3");
        option4 = new JButton("option4");
        option5 = new JButton("option5");
        exitOption = new JButton("Exit");

        menuPanel.add(option1);
        menuPanel.add(option2);
        menuPanel.add(option3);
        menuPanel.add(option4);
        menuPanel.add(option5);
        menuPanel.add(exitOption);

        exitButton = new JButton(new ImageIcon("Resources/Assets/Full_Screen_Icon.png"));
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        exitButton.setBounds(1350, 0, 50, 50);

        openingImage = new OpeningSplash();
        openingImage.setBounds(0, 0, 1920, 1080);

        class ButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == exitButton)
                {
                    //                     Starter.frame.dispose();
                    //                     Starter.frame.setUndecorated(!Starter.frame.isUndecorated());
                    //                     Starter.frame.pack();
                    //                     Starter.frame.setSize(1500,900);
                    //                     Starter.frame.setVisible(true);
                    System.exit(0);
                }

                else if (e.getSource() == menuButton)
                {

                    openingPane.add(menuPanel, new Integer(2));

                }
            }
        }

        exitButton.addActionListener(new ButtonListener());
        menuButton.addActionListener(new ButtonListener());

    }
    public JLayeredPane getGraphics(int chapterNum)
    {
        switch (chapterNum)
        {
            case 0:
            {
                openingPane.add(menuButton, new Integer(1));
                openingPane.add(exitButton, new Integer(1));
                openingPane.add(openingImage, new Integer(0));
                return openingPane;

            }
        }
        return null;

    }

}
