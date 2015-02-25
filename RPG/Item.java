public class Item
{
    String name;
    String desc;
    private int attack;
    private int defense;
    private int HRegen;
    private int ERegen;
    private int health;
    private int energy;
    private int bloodlust;
    /*public Item(String _name, int _attack, int _defense, int _health, int _HRegen, int _ERegen, int _energy, int _bloodlust)
    {
        name = _name;
        attack = _attack;
        defense = _defense;
        health = _health;
        HRegen = _HRegen;
        ERegen = _ERegen;
        energy = _energy;
        bloodlust = _bloodlust;
        
    }*/
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return desc;
    }
    
    public int getAttack(){
        return attack;
    }

    public int getDefense(){
        return defense;
    }

    public int getHRegen(){
        return HRegen;
    }
    
    public int getERegen(){
        return ERegen;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getEnergy(){
        return energy;
    }
    
    public int getBloodlust(){
        return bloodlust;
    }
}
