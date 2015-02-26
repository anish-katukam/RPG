public class Character extends Entity
{
    public Character()
    {
        super();
        this.stats = new Stats("The Necromancer");
        this.armor = new ArmorT1();
        this.weapon = new WeaponT1();
        this.ring = new RingOfHealth();
        this.hat = new HatOfHealth();
        
    }
}
