public class Entity
{
    private Weapon weapon;
    private Hat hat;
    private Potion potion;
    private Ring ring;
    private Armor armor;
    private Stats stats;
    public static void Entity(String name)
    {
        stats = new Stats(name);
        weapon = new weapon_t1;
        hat = new hat_t1;
        potion = new potion_t1;
        ring = new ring_t1;
        armor = new armor_t1;
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
    public void pickUp(Item x)
    {
      if (x instanceof Armor)
      {
          armor = (Armor) x;
      }
      else if (x instanceof Potion)
      {
          potion = (Potion) x;
      }
        else if (x instanceof Weapon)
      {
          weapon = (Weapon) x;
      }
        else if (x instanceof Hat)
      {
          hat = (Hat) x;
      }
        else if (x instanceof Ring)
      {
          ring = (Ring) x;
      }
    }
    public int attack (Entity a)
    {
       int damage = 100 * (this.getWeapon().getDamage() / a.getArmor().getResistance());
       a.getStats().takeHealthDamage(damage);
       return damage;
    }
    public void updateStats()
    {
        
    }
}
