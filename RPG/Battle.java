public class Battle
{
    int turnCount;
    Entity a;
    Entity b;
    private static TextIO t = new TextIO();
    public Battle (Entity x, Entity y)
    {
        turnCount=1;
        a = x;
        b = y;
    }

    public void advanceBattle()
    {
        a.getStats().updateStats(a);
        b.getStats().updateStats(b);
        if (a.getStats().getHealth() > 0 && b.getStats().getHealth() > 0)
        {
            turnCount++;
            a.attack(b);
            b.attack(a);
        }

    }

    public void advanceBattle(Potion p)
    {
        a.getStats().updateStats(a);
        b.getStats().updateStats(b);
        if (a.stats.health > 0 && b.stats.health > 0)
        {

            turnCount++;
            a.consume(p);
        }

    }

    public Entity promptUser()
    {
        t.clear();
        System.out.println("This is turn " + turnCount);
        System.out.println("You have " + a.stats.health + " health.");
        System.out.println("The " + b.getStats().getName() + " has " + b.stats.health + " health." );
        if (Inventory.potionExists())
        {
            if (t.getInt("Use potion or attack? (1/2)") == 1)
            {
                this.advanceBattle((Potion) Inventory.getPotion());
            }
        }
        else 
        {
            t.getInt("You have no choice but to fight. Enter 1 to continue.");
            advanceBattle();
            
        }
        if (a.stats.health == 0) return b;
        else if (b.stats.health == 0) return a;
        else return null;
    }

    public void collect()
    {
        t.clear();
        t.say("Victory!");
        if (t.getInt("Collect dropped items from enemy? (YES-1/NO-2) The items dropped are: \n" + b.getWeapon().getName() + "\n" + b.getArmor().getName() + "\n" + b.getHat().getName() + "\n" + b.getRing().getName() ) == 1)
        {
            b.drop();
            t.say("Items collected!");
        }
        else t.say("The items were lost...");
    }
}

