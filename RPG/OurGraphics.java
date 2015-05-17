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
    final JPanel menuOptionDisplay;
    ImageDrawer openingImage; 

    public OurGraphics()
    {
        openingPane = new JLayeredPane();
        
        menuOptionDisplay = new JPanel();

        menuButton = new JButton(new ImageIcon("Resources/Assets/menuicon.png"));
        menuButton.setOpaque(false);
        menuButton.setContentAreaFilled(false);
        menuButton.setBorderPainted(false);
        menuButton.setBounds((int)util.screen_size.getWidth()-50, 0, 50, 50);

        menuPanel = new JPanel(null);
        menuPanel.setBounds(0, 0, (int)util.screen_size.getWidth(), (int)util.screen_size.getHeight());
        menuPanel.setBackground(Color.black);

        inventory = new JButton("inventory");
        loadout = new JButton("loadout");
        stats = new JButton("stats");
        save = new JButton("save");
        quit = new JButton("quit");
        back = new JButton(new ImageIcon());
        
        back.setOpaque(true);
        back.setContentAreaFilled(false);
        back.setBorderPainted(true);
        back.setIcon(new ImageIcon("Resources/Assets/backicon.png"));

        inventory.setBounds(((int)util.screen_size.getWidth()/4)-150, ((int)util.screen_size.getHeight()/4)-130, 300, 100);
        loadout.setBounds(((int)util.screen_size.getWidth()/4)-150, ((int)util.screen_size.getHeight()/4)-5, 300, 100);
        stats.setBounds(((int)util.screen_size.getWidth()/4)-150, ((int)util.screen_size.getHeight()/4)+120, 300, 100);
        save.setBounds(((int)util.screen_size.getWidth()/4)-150, ((int)util.screen_size.getHeight()/4)+245, 300, 100);
        quit.setBounds(((int)util.screen_size.getWidth()/4)-150, ((int)util.screen_size.getHeight()/4)+370, 300, 100);
        back.setBounds(0, 0, 100, 100);

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
                
                if (e.getSource() == back)
                {
                    openingPane.remove(openingPane.getIndexOf(menuPanel));
                    Starter.frame.repaint();

                }
                
                if (e.getSource() == inventory) {
                    InventoryDisplay display  = new InventoryDisplay();
                }

            }
        }

        class MainPlayerMover implements MouseListener
        {
            public void mouseClicked(MouseEvent e)
            {
        
               
                moveThreader.cancel();
                GameLogic.character.moveTo(new Point((int)util.screen_point_adjust(e.getPoint()).getX(), piecewise_handler.getY((int)util.screen_point_adjust(e.getPoint()).getX(), Starter.getCurrentFrame())) , 500);
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
        back.addActionListener(new ButtonListener());
        inventory.addActionListener(new ButtonListener());

        SaveGame gameSave = new SaveGame(save,Inventory.getListOfPotions());
        gameSave.saveGame();

    }

    public void addEntity(Entity e)
    {
        //e.setBounds((int)e.getPosition().getX(), (int)e.getPosition().getY(),(int)e.getPosition().getX()+e.get_curr_sprite().getWidth(), (int)e.getPosition().getY()+e.get_curr_sprite().getHeight());
        e.setBounds(0,0, (int)util.screen_size.getWidth(), (int)util.screen_size.getHeight());
        openingPane.add(e, new Integer(1));
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
