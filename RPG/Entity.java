public class Entity
{
    private int health;
    private int bloodlust;
    private int defense;
    private int energy;
    private Weapon weapon;
    private Hat hat;
    private Potion potion;
    private Ring ring;
    private Armor armor;
    private String name;
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
    public String getName()
    {
        return this.name;
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
    public void takeHealthDamage(int amount)
    {
        health -= amount;
    }
    public int attack (Entity a)
    {
       int damage = 100 * (this.getWeapon().getDamage() / a.getArmor().getResistance());
       //b.takeHealthDamage(damage);
       return damage;
    }
    public void updateStats()
    {
        
    }
    public int getHealth(){
        return health;
    }
}
