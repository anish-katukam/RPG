public class Stats
{
    int health;
    int basehealth;
    int bloodlust;
    int defense;
    int energy;
    int attack;
    String name;
    int base = 100;
    public Stats(String x)
    {
        health = base;
        bloodlust = base;
        defense = base;
        energy = base;
        attack = base;
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

    public int getBloodlust()
    {
        return bloodlust;    
    }

    public int getDefense()
    {
        return defense;    
    }

    public int getEnergy()
    {
        return energy;    
    }

    public void setHealth(int n)
    {
        health = n;
    }

    public void setBloodlust(int n)
    {
        bloodlust = n;
    }  

    public void setDefense(int n)
    {
        defense = n;
    }  

    public void setEnergy(int n)
    {
        energy = n;
    }

    public void takeHealthDamage(int amount)
    {
        if (health - amount > 0) health -= amount;
        else health = 0;

    }

    public void updateStats(Entity a)
    {
        attack = base + a.getWeapon().getAttack() + a.getHat().getAttack() + a.getRing().getAttack();
        defense = base + a.getArmor().getDefense() + a.getHat().getDefense() + a.getRing().getDefense();
        basehealth = base + a.getRing().getHealth() + a.getHat().getHealth();

    }
}
