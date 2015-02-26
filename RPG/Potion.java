public class Potion extends Item
{
    public Potion (String name, String desc){
        super ();
    }
    
    public void explicate(TextIO t){
        t.say("Health Granted: " + health);
        t.say("Energy Granted: " + energy);
        t.say("Bloodlust Granted: " + bloodlust);
    }
}
