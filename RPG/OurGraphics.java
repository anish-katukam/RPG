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
    final JButton inventory;
    final JButton loadout;
    final JButton stats;
    final JButton save;
    final JButton quit;
    final JButton back;
    final JButton menuButton;
    ImageDrawer openingImage; 
    

    public OurGraphics()
    {
        openingPane = new JLayeredPane();

        menuPanel = new JPanel(new GridLayout(6, 1));
        menuPanel.setBounds(500, 150, 500, 500);

        menuButton = new JButton(new ImageIcon("Resources/Assets/menuicon.png"));
        menuButton.setBounds(1350, 60, 50, 50);

        inventory = new JButton("inventory");
        loadout = new JButton("loadout");
        stats = new JButton("stats");
        save = new JButton("save");
        quit = new JButton("quit");
        back = new JButton("back");

        menuPanel.add(inventory);
        menuPanel.add(loadout);
        menuPanel.add(stats);
        menuPanel.add(save);
        menuPanel.add(quit);
        menuPanel.add(back);

        openingImage = new ImageDrawer(0);
        openingImage.setBounds(0, 0, (int)util.screen_size.getWidth(),(int)util.screen_size.getHeight());

        class ButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == quit)
                {
                    System.exit(0);
                }

                if (e.getSource() == menuButton)
                {
                    openingPane.add(menuPanel, new Integer(2));

                }
                
            }
        }

        class MainPlayerMover implements MouseListener
        {
            public void mouseClicked(MouseEvent e)
            {
//                 Point whereToGo = e.getPoint();
//                 System.out.println("Hi");
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

        quit.addActionListener(new ButtonListener());
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
                openingPane.add(openingImage, new Integer(0));
                return openingPane;

            }
            default: 
            {
                return null;
            }
        }

    }

}
