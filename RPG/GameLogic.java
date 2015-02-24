/*
 * This class is where all events, and story, take place. Starter calls events from here.
 * Ease-of-use methods are at the very bottom - the most commonly used being delay and clear, which we created.
 * TextIO (t) is the primary source of methods for text involving delays and such - as well as opening and closing
 * logos.
 * 
 */
import java.util.Scanner;
public class GameLogic
{
    String name;
    TextIO t = new TextIO();
    /*
     * Exposition explains the story so far and leads into the opening credits.
     */
    public void exposition(){
        t.dramatic(2500,"We are a necromancer.");
        t.dramatic(4000,"necromancy: a form of magic involving communication with the deceased – either by summoning their spirit as an apparition or raising them bodily");
        t.dramatic(3000,"We have surpassed life. Most do this only once."); 
        t.dramatic(3500,"We are not most.");
        t.dramatic(3500,"We were feared and we were hailed, we were condemned and we were lauded.");
        t.dramatic(3000,"But we were strong. We raised those fallen to fell more.");
        t.dramatic(3500,"And now we have fallen.");
        t.dramatic(3500,"Life without adversity is not life.");
        t.dramatic(3500,"But we hail no life. We are no more alive than those we call from the abyss.");
        t.dramatic(4500,"And so we seek to end those who did this.");
    }


    /*
     * Intro is the beginning of the game (expectably), and introduces the person to the game. The character does not
     * get to define his own stats. Such is life.
     */
    public void intro(){
        t.dramatic(1750,"Welcome.");
        t.dramatic(2750,"This game is meant to be played in fullscreen. Please maximize now.");
        t.openingLogo();
    }

    public void chapterone(){
        t.chapterOneLogo();
        t.dramatic(3500,"We awoke far, far away in lands strange and barren.");
        t.dramatic(3500,"We could feel the ancient power flowing through the sand and reverberating in the air.");
        t.dramatic(3500,"We saw the yellow sands stretch forever. It culminated near the east in a great earthen spire.");
        t.dramatic(3500,"Our resolve hardened. We set off.");
        t.dramatic(3500,"The sands stirred a few feet ahead. We clutched our staff tightly.");
        t.dramatic(3500,"With a roar of rage, a draugr rose from the ground, holding a sceptre and prepared to attack.");
        t.dramatic(3500,"When we held power over the dead, we commanded legions of undead like this.");
        t.dramatic(3500,"With our power stolen, we must use other magiks to quell our enemies.");
        /*
         * Here, introduce the battle mechanic. If we chose to code individual battles seperately, we can 
         * have a call like battle.draugr();, or we can do a generic battle like battle(draugr);
         */
        t.dramatic(3500,"Sand swallows the remains, but leaves us our spoils. Its sceptre remains aboveground, and seems to beckon.");
        /*
         * The draugr drops its staff, here we introduce the whole inventory mechanic.
         */
        t.dramatic(3500,"We sense the land's hostility as well. It seems to be controlled by another.");
        t.dramatic(3500,"The spire in the distance looked all the more interesting.");
        t.dramatic(3500,"A swath of desert lay between. We continued onwards.");
    }
    
}
