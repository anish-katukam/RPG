public class Stats
{
    private int health;
    private int bloodlust;
    private int defense;
    private int energy; 
    private String name;

    public static void Stats(String x)
    {
       health = 100;
       bloodlust = 100;
       defense = 100;
       energy = 100;
       name = x;
    }
    public String getName()
    {
        return name;
    }
    public int getHealth()
    {
        return health;    
    }
    public void takeHealthDamage(int amount)
    {
        health -= amount;
    }
}
