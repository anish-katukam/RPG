public class Battle
{
    int turnCount;
    Entity a;
    Entity b;
    public Battle (Entity x, Entity y)
    {
        turnCount=1;
        a = x;
        b = y;
    }

    public Entity advanceBattle()
    {
        if (a.getStats().getHealth() > 0 && b.getStats().getHealth() > 0)
        {
            System.out.println("This is turn " + turnCount);
            turnCount++;
            System.out.println(a.getStats().getName() + " has dealt " + b.getStats().getName() + a.attack(b) + " damage, leaving " + a.getStats().getName() + " with " + a.getStats().getHealth() + " HP");
            System.out.println(b.getStats().getName() + " has dealt " + a.getStats().getName() + b.attack(a) + " damage, leaving " + b.getStats().getName() + " with " + a.getStats().getHealth() + " HP");

        }
        if (a.getStats().getHealth() == 0) return b;
        else if (b.getStats().getHealth() == 0) return a;
        else return null;
    }

    public Entity advanceBattle(Potion p)
    {
        if (a.getStats().getHealth() > 0 && b.getStats().getHealth() > 0)
        {
            System.out.println("This is turn " + turnCount);
            turnCount++;
            a.consume(p);
        }
        if (a.getStats().getHealth() == 0) return b;
        else if (b.getStats().getHealth() == 0) return a;
        else return null;
    }

}

