public class Weapon extends Item
{
    public Weapon(){
        super();
    }
    
    public void explicate(TextIO t){
        t.say("Attack: " + attack);
    }
}
