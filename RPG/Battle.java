public class Battle
{
    public static void Battle (Entity a, Entity b)
    {
        int turnCount=1;
        while (a.getHealth > 0 && b.getHealth > 0)
       {
            System.out.println("This is turn " + turnCount);
            turn++;
            if (a.getSpeed() > b.getSpeed())
           {
            a.attack(b);
            b.attack(a);
           }
           else
           {
            a.attack(b);
            b.attack(a);
           }
       }
    }
}
