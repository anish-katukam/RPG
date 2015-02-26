import java.util.*;
public class Entity
{
    protected Weapon weapon;
    protected Hat hat;
    protected Potion potion;
    protected Ring ring;
    protected Armor armor;
    protected Stats stats;
    Random random = new Random();
    public Entity()
    {
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
        int damage = 10 * (this.getStats().getAttack() / a.getStats().getDefense());
        int critchance = random.nextInt(11);
        if (critchance == 1){
            return (2*damage);
        }
        else{
            damage += random.nextInt(damage/3);
        }
        a.getStats().takeHealthDamage(damage);
        return damage;
    }
    public void drop()
    {
        Inventory.addItem(weapon);
        Inventory.addItem(ring);
        Inventory.addItem(armor);
        Inventory.addItem(hat);
    }
}
