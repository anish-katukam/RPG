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
    ImageDrawer openingImage; 

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

        openingImage = new ImageDrawer(0);
        openingImage.setBounds(0, 0, (int)util.screen_size.getWidth(),(int)util.screen_size.getHeight());

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
        
        class MainPlayerMover implements MouseListener
        {
            public void mouseClicked(MouseEvent e)
            {
               Point whereToGo = e.getPoint();
               System.out.println("Hi");
            }
            public void mousePressed(MouseEvent e)
            {
               
            }
            public void mouseReleased(MouseEvent e)
            {
               
            }
            public void mouseEntered(MouseEvent e)
            {
               
            }
            public void mouseExited(MouseEvent e)
            {
               
            }
        }

        exitButton.addActionListener(new ButtonListener());
        menuButton.addActionListener(new ButtonListener());
        Starter.frame.addMouseListener(new MainPlayerMover());

    }
    public void addEntity(Entity e)
    {
        e.setBounds((int)e.getPosition().getX(), (int)e.getPosition().getY(),(int)e.getPosition().getX()+e.get_curr_sprite().getWidth(), (int)e.getPosition().getY()+e.get_curr_sprite().getHeight());
        openingPane.add(e, new Integer(2));
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
            default: 
            {
                return null;
            }
        }

    }
    
    public void saveGame()  {
        FileSystemView fsv = new FileSystemView();
        JFileChooser fileChooser = new JFileChooser("RPG",fsv);
        
        public class saveGameClicker implements ActionListener   {
            public void actionPerformed()   {
                fileChooser.setDialogTitle("Specify a file to save");   
 
                int userSelection = fileChooser.showSaveDialog(parentFrame);
                 
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
//                     System.out.println("Save as file: " + fileToSave.getAbsolutePath());
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileToSave)))   {
                       out.writeObject(myObject);
                    } catch (IOException ioe) {
                        // do something if there is an error, at least this so you
                        // know if something went wrong
                       ioe.printStackTrace();
                    }
                }
            }
        }
        
        File file = "Save Game.txt";/* ask the user for a file name somehow - JFileChooser, whatever */


        
    }

}
