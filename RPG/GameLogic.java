/*
 * This class is where all events, and story, take place. Starter calls events from here.
 * Ease-of-use methods are at the very bottom - the most commonly used being delay and clear, which we created.
 * TextIO is the primary source of methods for text involving delays and such - as well as opening and closing
 * logos.
 * 
   */
import java.util.Scanner;
public class GameLogic
{
    String name;
    TextIO t = new TextIO();
    /*
     * Intro is the beginning of the game (expectably), and defines the character's name. The character does not
     * get to define his own stats. Such is life.
       */
    public void intro(){
        t.dramatic(750,"Welcome.");
        t.clear();
        t.openingLogo();
        
        
    }
}
