public class Hat extends Item
{
    public Hat(String name, String desc){
        super(name, desc);
    }
    
    public void explicate(TextIO t){
        t.say("Health Granted: " + health);
        t.say("Energy Granted: " + energy);
        t.say("Attack Granted: " + attack);
        t.say("Bloodlust Granted: " + bloodlust);
        t.say("Defense Granted: " + defense);
    }
}
