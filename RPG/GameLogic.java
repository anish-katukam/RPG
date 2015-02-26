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
    Character character = new Character();
    Enemy enemy;
    Entity victor = null;
    Battle battle;
    /*
     * Exposition explains the story so far and leads into the opening credits.
     */
    public void exposition(){
        t.dramatic(2500,"We are a necromancer.");
        t.dramatic(4000,"necromancy: a form of magic involving communication with the deceased – either by summoning their spirit as an apparition or raising them bodily");
        t.dramatic(3000,"We have surpassed life. Most do this only once."); 
        t.dramatic(3500,"We are not most.");
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
        /*t.chapterOneLogo();
        t.dramatic(3500,"We awoke far, far away in lands strange and barren.");
        t.dramatic(3500,"We could feel the ancient power flowing through the sand and reverberating in the air.");
        t.dramatic(3500,"We saw the yellow sands stretch forever. It culminated near the east in a great earthen spire.");
        t.dramatic(3500,"We set off.");
        t.dramatic(3500,"The sands stirred a few feet ahead. We clutched our staff tightly.");
        t.dramatic(3500,"With a roar of rage, a draugr rose from the ground, holding a sceptre and prepared to attack.");
        t.dramatic(3500,"When we held power over the dead, we commanded legions of undead like this.");
        t.dramatic(3500,"With our power stolen, we must use other magic to quell our enemies.");*/
        Enemy draugr = new Enemy("Draugr", new WeaponT2(), new ArmorT2(), new RingOfHealth(), new HatOfHealth());
        System.out.println(draugr.stats.health);
        battle = new Battle(character, enemy);
        while (victor == null)
        {
            victor = battle.promptUser();
        }
        if (victor == character)
        {
            battle.collect();
        }
        else{
            gameOver();
        }
        /*
        t.dramatic(3500,"We sense the land's hostility as well. It seems to be controlled by another.");
        t.dramatic(3500,"The spire in the distance looked all the more interesting.");
        t.dramatic(3500,"A swath of desert lay between. We continued onwards.");*/
         
    }

    public void chaptertwo(){
        t.chapterTwoLogo();
    }

    public void chapterthree(){
        t.chapterThreeLogo();
    }

    public void gameOver()
    {
        t.dramatic(3000, "We've failed.");
        t.dramatic(2000, "Death is no stranger to us.");
        t.dramatic(3000, "Many times we've called Death to claim our enemies.");
        t.dramatic(3000, "How ironic.");
        outro(true);
    }
    
    public void outro(boolean lose){
        t.dramatic(2000, "Thanks for playing.");
        if (lose) {
            t.dramatic(2000, "It's a shame you couldn't make it.");
            t.dramatic(3000, "But not all of us do.");
        }
        t.dramatic(3000, "          coded and designed by \n                          Anish Katukam and Sid Mani");
    }
}
