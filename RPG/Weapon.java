public class Weapon extends Item
{
    public Weapon(String name, String desc){
        super(name, desc);
    }
    
    public void explicate(TextIO t){
        t.say("Attack: " + attack);
    }
}
