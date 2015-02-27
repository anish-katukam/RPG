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
        if (a.getStats().getHealth() > 0 && b.getStats().getHealth() > 0)
        {
            System.out.println("This is turn " + turnCount);
            turnCount++;
            System.out.println(a.getStats().getName() + " has dealt " + b.getStats().getName() + " "+ a.attack(b) + " damage, leaving " + b.getStats().getName() + " with " + b.getStats().getHealth() + " HP");
            System.out.println(b.getStats().getName() + " has dealt " + a.getStats().getName() + " "+ b.attack(a) + " damage, leaving " + a.getStats().getName() + " with " + a.getStats().getHealth() + " HP");

        }

    }

    public void advanceBattle(Potion p)
    {
        a.getStats().updateStats(a);
        b.getStats().updateStats(b);
        if (a.stats.health > 0 && b.stats.health > 0)
        {
            System.out.println("This is turn " + turnCount);
            turnCount++;
            a.consume(p);
        }

    }

    public Entity promptUser()
    {
        System.out.println(a.stats.health);
        System.out.println(b.stats.health);
        if (t.getInt("Use potion or attack? (1/2)") == 1)
        {
            this.advanceBattle((Potion) Inventory.getPotion());

        }
        else advanceBattle();
        if (a.stats.health == 0) return b;
        else if (b.stats.health == 0) return a;
        else return null;
    }

    public void collect()
    {
        if (t.getInt("Collect dropped items from enemy? (YES-1/NO-2) The weapon dropped is: " + b.getWeapon().getName()) == 1)
        {
            b.drop();
            t.say("Items collected!");
        }
        else t.say("The items were lost...");
    }
}

