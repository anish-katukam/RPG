public class Battle
{
    public static void Battle (Entity a, Entity b)
    {
        int turnCount=1;
        while (a.getHealth() > 0 && b.getHealth() > 0)
       {
            System.out.println("This is turn " + turnCount);
            turnCount++;
       }
    }
}
