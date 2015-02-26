/*
 * Add a system to add extra effects
 */
public class Ring extends Item
{
    public Ring(String name, String desc){
        super();
    }
    
    public void explicate(TextIO t){
        t.say("Health Granted: " + health);
        t.say("Energy Granted: " + energy);
        t.say("Attack Granted: " + attack);
        t.say("Bloodlust Granted: " + bloodlust);
        t.say("Defense Granted: " + defense);
    }
}
