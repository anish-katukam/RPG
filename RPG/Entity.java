public class Entity
{
    private int health;
    private int bloodlust;
    private int defense;
    private int mana;
    private Weapon weapon;
    private Hat hat;
    private Potion potion;
    private Ring ring;
    private Armor armor;
    
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
    private void pickUp(Item x)
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
}
