public abstract class Item
{
    protected String name;
    protected String desc;
    protected int attack;
    protected int defense;
    protected int health;
    protected int energy;
    protected int bloodlust;

    public Item (String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return desc;
    }

    public abstract void explicate(TextIO t);

    public int getAttack(){
        return 0;
    }

    public int getDefense(){
        return 0;
    }

    public int getHealth(){
        return 0;
    }

    public int getEnergy(){
        return 0;
    }

    public int getBloodlust(){
        return 0;
    }

    public String toString(){
        return name + "\n" + desc;
    }
}
