/*
 * Add a system to calculate health, health regen, and resistances.
 */
public class Armor extends Item
{
    public Armor (String name, String desc){
        super (name, desc);
    }
    
    public void explicate(TextIO t){
        t.say("Health: " + health);
        t.say("Armor: " + defense);
    }
}
