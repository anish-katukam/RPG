
public class Enemy extends Entity
{

    public Enemy(String n, int base, Weapon _weapon, Armor _armor, Ring _ring, Hat _hat)
    {
        super();
        this.stats = new Stats(n,base);
        this.armor = _armor;
        this.weapon = _weapon;
        this.ring = _ring;
        this.hat = _hat;
        
    }

}
