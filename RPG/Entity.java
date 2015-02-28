import java.util.*;
public class Entity //this class is used for every living thing in the game
{
    protected Weapon weapon; //entities possess certain items
    protected Hat hat;
    protected Potion potion;
    protected Ring ring;
    protected Armor armor;
    protected Stats stats; // object containing the stats used for damage calculations
    Random random = new Random(); //instance of random
    public Entity() //constructor (handled in subclasses)
    {
    }

    public Weapon getWeapon() //return items
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

    public Stats getStats() //return stats object
    {
        return this.stats;
    }

    public void consume(Potion p) //consume a potion, add its stat boosts to current stats
    {
        this.stats.setHealth(this.stats.getHealth() + p.getHealth());
        this.stats.setEnergy(this.stats.getEnergy() + p.getEnergy());
        this.stats.setBloodlust(this.stats.getBloodlust() + p.getBloodlust());
    }

    public int attack (Entity a) //attack another entity
    {
        int damage = 10 * (this.getStats().getAttack() / a.getStats().getDefense()); //dmg calculations
        int critchance = random.nextInt(11); //random chance, causes some uncertainty in damage number
        if (critchance == 1){
            System.out.println("Critical Strike");
            return (2*damage);
        }
        else{
            damage += random.nextInt(10);
        }
        a.getStats().takeHealthDamage(damage); //get stats object of victim, decrease health
        return damage; //return amount of damage taken
    }
    public void drop() //drop items, add to inventory (used when enemies are killed)
    {
        Inventory.addItem(weapon); //call addItem method which adds them to the array
        Inventory.addItem(ring);
        Inventory.addItem(armor);
        Inventory.addItem(hat);
    }
}
