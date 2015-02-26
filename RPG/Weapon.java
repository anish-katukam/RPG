public class Weapon extends Item
{
    public Weapon(String name, String desc){
        super();
    }
    
    public void explicate(TextIO t){
        t.say("Attack: " + attack);
    }
}
