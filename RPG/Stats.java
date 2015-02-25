public class Stats
{
    int health;
    int base_health;
    int bloodlust;
    int base_bloodlust;
    int defense;
    int base_energy;
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

    public int getAttack()
    {
        return attack;
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
         if (n < base_health) health = n;
        else health = base_health;
    }

    public void setBloodlust(int n)
    {
       if (n < base_bloodlust) bloodlust = n;
        else bloodlust = bloodlust;
    }  

    public void setDefense(int n)
    {
        defense = n;
    }  

    public void setEnergy(int n)
    {
        if (n < base_energy) energy = n;
        else energy = base_energy;
    }

    public void setAttack(int n)
    {
        attack = n;
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
        base_health = base + a.getRing().getHealth() + a.getHat().getHealth();
        bloodlust = base + a.getRing().getBloodlust() + a.getHat().getBloodlust();
        base_energy = base + a.getRing().getEnergy() + a.getHat().getEnergy();
    }
}
