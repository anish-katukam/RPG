
/**
 * Write a description of class SaveGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveGame
{
    public static JButton button;
    public static Item[] backpack;
    
    public SaveGame(JButton b,Item[] pack) {
        button = b;
        backpack = pack;
    }
    
    public void saveGame()  {
//         FileSystemView fsv = new FileSystemView();
        JFileChooser fileChooser = new JFileChooser();
        
        class saveGameClicker implements ActionListener {
            public void actionPerformed(ActionEvent e)  {
                fileChooser.setDialogTitle("Specify a file to save");   
 
                int userSelection = fileChooser.showSaveDialog(button);
                 
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
//                     System.out.println("Save as file: " + fileToSave.getAbsolutePath());
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileToSave)))   {
                       out.writeObject(backpack);
                    } catch (IOException ioe) {
                        // do something if there is an error, at least this so you
                        // know if something went wrong
                       ioe.printStackTrace();
                    }
                }
            }
        }
        
        button.addActionListener(new saveGameClicker());
        
//         File file = "Save Game.txt";/* ask the user for a file name somehow - JFileChooser, whatever */


        
    }
}
