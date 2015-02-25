import java.util.*;
public class Entity
{
    private Weapon weapon;
    private Hat hat;
    private Potion potion;
    private Ring ring;
    private Armor armor;
    private Stats stats;
    Random random = new Random();
    public Entity(String name)
    {
        //stats = new Stats(name);
        //weapon = new Crowbar();
        //hat = new GhastlyGibus();
        //potion = new Obamacare();
        //ring = new ring_t1();
        //armor = new Norton360();
    }

    public Weapon getWeapon()
    {
        return this.weapon;
    }

    public Hat getHat()
    {
        return this.hat;
    }

    public Potion getPotion()
    {
        return this.potion;
    }

    public Ring getRing()
    {
        return this.ring;  
    }

    public Armor getArmor()
    {
        return this.armor;
    }

    public Stats getStats()
    {
        return this.stats;
    }

    public void consume(Potion p)
    {
        this.stats.setHealth(this.stats.getHealth() + p.getHealth());
        this.stats.setEnergy(this.stats.getEnergy() + p.getEnergy());
        this.stats.setBloodlust(this.stats.getBloodlust() + p.getBloodlust());
    }

    public int attack (Entity a)
    {
        int damage = 100 * (this.getStats().getAttack() / a.getStats().getDefense());
        int critchance = random.nextInt(11);
        if (critchance == 1){
            return (2*damage);
        }
        else{
            damage += (damage*(random.nextInt(10)-5));
        }
        a.getStats().takeHealthDamage(damage);
        return damage;
    }
}
