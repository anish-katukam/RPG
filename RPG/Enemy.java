
public class Enemy extends Entity
{

    public Enemy(String n, Weapon _weapon, Armor _armor, Ring _ring)
    {
        super();
        this.stats = new Stats(n);
        this.armor = _armor;
        this.weapon = _weapon;
        this.ring = _ring;

    }

}
